package kg.one.salon.Model.Mapper.Impl;

import kg.one.salon.Model.Dto.MastersWorkDaysDto;
import kg.one.salon.Model.Mapper.MastersWorkDaysMapper;
import kg.one.salon.Model.MastersWorkDays;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MastersWorkDaysMapperImpl implements MastersWorkDaysMapper {
    @Override
    public MastersWorkDays toEntity(MastersWorkDaysDto mastersWorkDaysDto) {
        return MastersWorkDaysMapper.INSTANCE.toEntity(mastersWorkDaysDto);
    }

    @Override
    public MastersWorkDaysDto toDto(MastersWorkDays mastersWorkDays) {
        return MastersWorkDaysMapper.INSTANCE.toDto(mastersWorkDays);
    }

    @Override
    public List<MastersWorkDays> toListEntity(List<MastersWorkDaysDto> d) {
        return MastersWorkDaysMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<MastersWorkDaysDto> toListDto(List<MastersWorkDays> e) {
        return MastersWorkDaysMapper.INSTANCE.toListDto(e);
    }
}
