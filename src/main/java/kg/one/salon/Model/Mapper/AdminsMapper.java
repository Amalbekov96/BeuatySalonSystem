package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.AdminsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Mapper
public interface AdminsMapper extends BaseMapper<Admins, AdminsDto> {
    AdminsMapper INSTANCE = Mappers.getMapper(AdminsMapper.class);
}
