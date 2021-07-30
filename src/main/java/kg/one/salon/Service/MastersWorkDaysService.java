package kg.one.salon.Service;

import kg.one.salon.Model.Masters;
import kg.one.salon.Model.MastersWorkDays;
import kg.one.salon.Repository.MastersRepository;
import kg.one.salon.Repository.MastersWorkDaysRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MastersWorkDaysService extends BaseServiceImpl<MastersWorkDays, MastersWorkDaysRepository> {
    @Autowired
    private MastersWorkDaysRepository mastersWorkDaysRepository;

    public List<MastersWorkDays> findBybranchIdAndMasterId(Long branchId, Long masterId){
        return mastersWorkDaysRepository.findALLByBranchIdAndMaster_id(branchId, masterId);
    }
}
