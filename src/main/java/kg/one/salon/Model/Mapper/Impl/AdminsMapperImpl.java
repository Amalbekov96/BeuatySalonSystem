package kg.one.salon.Model.Mapper.Impl;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.AdminsDto;
import kg.one.salon.Model.Mapper.AdminsMapper;

import java.util.List;

public class AdminsMapperImpl implements AdminsMapper {
    @Override
    public Admins toEntity(AdminsDto adminsDto) {
        return AdminsMapper.INSTANCE.toEntity(adminsDto);
    }

    @Override
    public AdminsDto toDto(Admins admins) {
        return null;
    }

    @Override
    public List<Admins> toListEntity(List<AdminsDto> d) {
        return null;
    }

    @Override
    public List<AdminsDto> toListDto(List<Admins> e) {
        return null;
    }
}
