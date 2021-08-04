package kg.one.salon.Model.Mapper.Impl;

import kg.one.salon.Model.Dto.ReservedHoursDto;
import kg.one.salon.Model.Mapper.ReservedHoursMapper;
import kg.one.salon.Model.ReservedHours;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservedHoursMapperImpl implements ReservedHoursMapper {
    @Override
    public ReservedHours toEntity(ReservedHoursDto reservedHoursDto) {
        return ReservedHoursMapper.INSTANCE.toEntity(reservedHoursDto);
    }

    @Override
    public ReservedHoursDto toDto(ReservedHours reservedHours) {
        return ReservedHoursMapper.INSTANCE.toDto(reservedHours);
    }

    @Override
    public List<ReservedHours> toListEntity(List<ReservedHoursDto> d) {
        return ReservedHoursMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<ReservedHoursDto> toListDto(List<ReservedHours> e) {
        return ReservedHoursMapper.INSTANCE.toListDto(e);
    }
}
