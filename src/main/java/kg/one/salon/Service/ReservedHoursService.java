package kg.one.salon.Service;

import kg.one.salon.Exception.EntityNotFound;
import kg.one.salon.Exception.IncorrectHours;
import kg.one.salon.Model.Dto.ReservedHoursDto;
import kg.one.salon.Model.Mapper.ReservedHoursMapper;
import kg.one.salon.Model.ReservedHours;
import kg.one.salon.Repository.ReservedHoursRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservedHoursService extends BaseServiceImpl<ReservedHours, ReservedHoursDto, ReservedHoursRepository, ReservedHoursMapper> {
    public ReservedHoursService(ReservedHoursRepository repo, ReservedHoursMapper mapper) {
        super(repo, mapper);
    }
    @Autowired
    private ReservedHoursRepository repo;
    @Autowired
    private ReservedHoursMapper mapper;

    public ResponseEntity<?> findAllByWorkDayId(Long id){
        try{
            return ResponseEntity.ok(mapper.toListDto(repo.findAllByWorkDayIdId(id)));
        }catch(Exception e){
            e.printStackTrace();
            throw new EntityNotFound("Was not found");
        }
    }

    @Override
    public ResponseEntity<?> create(ReservedHoursDto reservedHoursDto) {
        List<ReservedHoursDto> dtoList = mapper.toListDto(repo.findAllByWorkDayIdId(reservedHoursDto.getWorkDayId().getId()));

        if(reservedHoursDto.getEndTime().getMinute() > 5 || reservedHoursDto.getStartTime().getMinute() > 5){
            throw new IncorrectHours("Please try to put only rounded times like 11 : 00 - 12 : 00 ");
        }

        if(reservedHoursDto.getStartTime().getHour() == reservedHoursDto.getEndTime().getHour()){
            throw  new IncorrectHours("Please make sure you have chosen correct range!");
        }

        for(ReservedHoursDto d : dtoList){

            if(d.getWorkDayId().getStartTime().getHour() > reservedHoursDto.getStartTime().getHour()){
                throw new IncorrectHours("Master does not work at this hour!");
            }

            if(d.getWorkDayId().getEndTime().getHour() < reservedHoursDto.getEndTime().getHour()){
                throw  new IncorrectHours("Master does not work at this hour!");
            }

            if(d.getStartTime().getHour() == reservedHoursDto.getStartTime().getHour() && d.getEndTime().getHour() == reservedHoursDto.getEndTime().getHour()){
                throw  new IncorrectHours("These hours already booked!");
            }

            if(d.getStartTime().getHour() < reservedHoursDto.getStartTime().getHour() && d.getEndTime().getHour() > reservedHoursDto.getStartTime().getHour()){
                throw new IncorrectHours("This hour is not correct!");
            }

            if(d.getStartTime().getHour() < reservedHoursDto.getEndTime().getHour() && d.getEndTime().getHour() > reservedHoursDto.getEndTime().getHour()){
                throw new IncorrectHours("This hour is not correct!");
            }

            if(d.getStartTime().getHour() == reservedHoursDto.getStartTime().getHour() && d.getEndTime().getHour() < reservedHoursDto.getEndTime().getHour()){
                throw new IncorrectHours("These hours already booked!");
            }

            if(d.getEndTime().getHour() == reservedHoursDto.getEndTime().getHour() && d.getStartTime().getHour() > reservedHoursDto.getStartTime().getHour()){
                throw new IncorrectHours("These hours already booked!");
            }
        }

        return super.create(reservedHoursDto);
    }
}
