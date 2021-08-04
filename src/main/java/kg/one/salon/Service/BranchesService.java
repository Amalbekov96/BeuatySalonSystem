package kg.one.salon.Service;

import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Dto.BranchesDto;
import kg.one.salon.Model.Mapper.BranchesMapper;
import kg.one.salon.Repository.BranchesRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BranchesService extends BaseServiceImpl<Branches, BranchesDto, BranchesRepository, BranchesMapper> {
    public BranchesService(BranchesRepository repo, BranchesMapper mapper) {
        super(repo, mapper);
    }
}
