package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Dto.MastersDto;
import kg.one.salon.Model.Dto.PhonesDto;
import kg.one.salon.Model.Masters;
import kg.one.salon.Model.Phones;
import org.mapstruct.factory.Mappers;

public interface PhonesMapper extends BaseMapper<Phones, PhonesDto> {
    PhonesMapper INSTANCE = Mappers.getMapper(PhonesMapper.class);
}
