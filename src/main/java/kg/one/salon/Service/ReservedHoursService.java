package kg.one.salon.Service;

import kg.one.salon.Exception.EntityNotFound;
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


        for(ReservedHoursDto d : dtoList){

//            if(d.getWorkDayId().getStartTime().toLocalTime()
        }
        return super.create(reservedHoursDto);
    }
}
