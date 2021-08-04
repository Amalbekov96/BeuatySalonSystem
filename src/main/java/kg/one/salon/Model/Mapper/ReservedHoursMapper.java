package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Dto.PhonesDto;
import kg.one.salon.Model.Dto.ReservedHoursDto;
import kg.one.salon.Model.Phones;
import kg.one.salon.Model.ReservedHours;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservedHoursMapper extends BaseMapper<ReservedHours, ReservedHoursDto> {
    ReservedHoursMapper INSTANCE = Mappers.getMapper(ReservedHoursMapper.class);
}
