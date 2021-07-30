package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.AdminsDto;
import org.mapstruct.factory.Mappers;

public interface AdminsMapper extends BaseMapper<Admins, AdminsDto> {
    AdminsMapper INSTANCE = Mappers.getMapper(AdminsMapper.class);
}
