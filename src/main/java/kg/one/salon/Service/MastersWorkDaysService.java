package kg.one.salon.Service;

import kg.one.salon.Exception.EntityNotFound;
import kg.one.salon.Model.Dto.MastersWorkDaysDto;
import kg.one.salon.Model.Mapper.MastersWorkDaysMapper;
import kg.one.salon.Model.MastersWorkDays;
import kg.one.salon.Repository.MastersWorkDaysRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MastersWorkDaysService extends BaseServiceImpl<MastersWorkDays, MastersWorkDaysDto, MastersWorkDaysRepository, MastersWorkDaysMapper> {
    public MastersWorkDaysService(MastersWorkDaysRepository repo, MastersWorkDaysMapper mapper) {
        super(repo, mapper);
    }

    private MastersWorkDaysRepository repo;
    private MastersWorkDaysMapper mapper;

    public ResponseEntity<?> findAllByBranchId(Long id){
        try{
            return ResponseEntity.ok(mapper.toListDto(repo.findAllByBranchId(id)));
        }catch (Exception e){
            e.printStackTrace();
            throw new EntityNotFound("Master work day is not found.");
        }
    }



    public ResponseEntity<?> findByWorkDay(LocalDate date){
        try{
            return ResponseEntity.ok(mapper.toListDto(repo.findAllByWorkDay(date)));
        }catch (Exception e){
            e.printStackTrace();
            throw new EntityNotFound("Master work day is not found.");
        }
    }

    public ResponseEntity<?> findByBranchIdAndDate(Long id, LocalDate date){
        return ResponseEntity.ok(mapper.toListDto(repo.findAllByBranchIdAndWorkDay(id, date)));
    }
}
