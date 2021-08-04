package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Dto.PhonesDto;
import kg.one.salon.Model.Dto.SalonsDto;
import kg.one.salon.Model.Phones;
import kg.one.salon.Model.Salons;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SalonsMapper extends BaseMapper<Salons, SalonsDto> {
    SalonsMapper INSTANCE = Mappers.getMapper(SalonsMapper.class);
}
