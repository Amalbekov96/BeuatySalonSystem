package kg.one.salon.Service;

import kg.one.salon.Exception.EntityNotFound;
import kg.one.salon.Model.Dto.MastersWorkDaysDto;
import kg.one.salon.Model.Mapper.MastersWorkDaysMapper;
import kg.one.salon.Model.MastersWorkDays;
import kg.one.salon.Repository.MastersWorkDaysRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MastersWorkDaysService extends BaseServiceImpl<MastersWorkDays, MastersWorkDaysDto, MastersWorkDaysRepository, MastersWorkDaysMapper> {
    public MastersWorkDaysService(MastersWorkDaysRepository repo, MastersWorkDaysMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private MastersWorkDaysRepository repo;
    @Autowired
    private MastersWorkDaysMapper mapper;


    public ResponseEntity<?> findAllByBranchId(Long id) {
        try{
            return ResponseEntity.ok(mapper.toListDto(repo.findAllByBranchId(id)));
        }catch (Exception e) {
            e.printStackTrace();
            throw new EntityNotFound("Master work day is not found.");
        }
    }

    public ResponseEntity<?> findByWorkDay(LocalDate date){
        try{
            return ResponseEntity.ok(mapper.toListDto(repo.findAllByWorkDay(date)));
        } catch (Exception e){
            e.printStackTrace();
            throw new EntityNotFound("Master work day is not found.");
        }
    }

    public ResponseEntity<?> findByBranchIdAndDate(Long id, LocalDate date){
        List<MastersWorkDaysDto> dto =  mapper.toListDto(repo.findAllByBranchIdAndWorkDay(id, date));
        for(MastersWorkDaysDto d : dto){
            d.setAdmin_id(null);
        }
        return ResponseEntity.ok(dto);
    }
}
