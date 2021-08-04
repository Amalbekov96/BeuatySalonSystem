package kg.one.salon.Repository;

import kg.one.salon.Model.MastersWorkDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MastersWorkDaysRepository extends BaseRepository<MastersWorkDays> {
    List<MastersWorkDays> findALLByBranchIdAndMasterId(Long branchId, Long masterId);
    List<MastersWorkDays> findAllByBranchId(Long id);
    List<MastersWorkDays> findAllByWorkDay(LocalDate date);
    List<MastersWorkDays> findAllByBranchIdAndWorkDay(Long id, LocalDate date);
}
