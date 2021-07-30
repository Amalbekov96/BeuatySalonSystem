package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Dto.MastersDto;
import kg.one.salon.Model.Dto.MastersWorkDaysDto;
import kg.one.salon.Model.Masters;
import kg.one.salon.Model.MastersWorkDays;
import org.mapstruct.factory.Mappers;

public interface MastersWorkDaysMapper extends BaseMapper<MastersWorkDays, MastersWorkDaysDto> {
    MastersWorkDaysMapper INSTANCE = Mappers.getMapper(MastersWorkDaysMapper.class);
}
