package kg.one.salon.Service;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Branches;
import kg.one.salon.Repository.AdminsRepository;
import kg.one.salon.Repository.BranchesRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchesService extends BaseServiceImpl<Branches, BranchesRepository> {

    @Autowired
    private BranchesRepository branchesRepository;

    public List<Branches> findBySalonId(Long id){
        return branchesRepository.findALlBySalonId(id);
    }
}
