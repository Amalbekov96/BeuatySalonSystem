package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Dto.AdminsDto;
import kg.one.salon.Model.Dto.BranchesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BranchesMapper extends BaseMapper<Branches, BranchesDto> {
    BranchesMapper INSTANCE = Mappers.getMapper(BranchesMapper.class);
}
