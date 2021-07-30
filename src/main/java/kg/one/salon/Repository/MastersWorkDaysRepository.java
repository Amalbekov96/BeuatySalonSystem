package kg.one.salon.Repository;

import kg.one.salon.Model.Masters;
import kg.one.salon.Model.MastersWorkDays;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MastersWorkDaysRepository extends BaseRepository<MastersWorkDays> {
    List<MastersWorkDays> findALLByBranchIdAndMaster_id(Long branchId, Long masterId);
}
