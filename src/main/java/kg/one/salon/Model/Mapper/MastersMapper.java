package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Clients;
import kg.one.salon.Model.Dto.ClientsDto;
import kg.one.salon.Model.Dto.MastersDto;
import kg.one.salon.Model.Masters;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MastersMapper extends BaseMapper<Masters, MastersDto> {
    MastersMapper INSTANCE = Mappers.getMapper(MastersMapper.class);
}
