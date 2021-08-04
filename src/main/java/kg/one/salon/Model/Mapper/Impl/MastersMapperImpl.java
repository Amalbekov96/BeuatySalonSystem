package kg.one.salon.Model.Mapper.Impl;

import kg.one.salon.Model.Dto.MastersDto;
import kg.one.salon.Model.Mapper.MastersMapper;
import kg.one.salon.Model.Masters;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MastersMapperImpl implements MastersMapper {
    @Override
    public Masters toEntity(MastersDto mastersDto) {
        return MastersMapper.INSTANCE.toEntity(mastersDto);
    }

    @Override
    public MastersDto toDto(Masters masters) {
        return MastersMapper.INSTANCE.toDto(masters);
    }

    @Override
    public List<Masters> toListEntity(List<MastersDto> d) {
        return MastersMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<MastersDto> toListDto(List<Masters> e) {
        return MastersMapper.INSTANCE.toListDto(e);
    }
}
