package kg.one.salon.Model.Mapper.Impl;

import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Dto.BranchesDto;
import kg.one.salon.Model.Mapper.BranchesMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchesMapperImpl implements BranchesMapper {
    @Override
    public Branches toEntity(BranchesDto branchesDto) {

        return BranchesMapper.INSTANCE.toEntity(branchesDto);
    }

    @Override
    public BranchesDto toDto(Branches branches) {
        return BranchesMapper.INSTANCE.toDto(branches);
    }

    @Override
    public List<Branches> toListEntity(List<BranchesDto> d) {
        return BranchesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<BranchesDto> toListDto(List<Branches> e) {
        return BranchesMapper.INSTANCE.toListDto(e);
    }
}
