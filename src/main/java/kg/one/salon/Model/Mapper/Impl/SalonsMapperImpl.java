package kg.one.salon.Model.Mapper.Impl;

import kg.one.salon.Model.Dto.SalonsDto;
import kg.one.salon.Model.Mapper.SalonsMapper;
import kg.one.salon.Model.Salons;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonsMapperImpl implements SalonsMapper {
    @Override
    public Salons toEntity(SalonsDto salonsDto) {
        return SalonsMapper.INSTANCE.toEntity(salonsDto);
    }

    @Override
    public SalonsDto toDto(Salons salons) {
        return SalonsMapper.INSTANCE.toDto(salons);
    }

    @Override
    public List<Salons> toListEntity(List<SalonsDto> d) {
        return SalonsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<SalonsDto> toListDto(List<Salons> e) {
        return SalonsMapper.INSTANCE.toListDto(e);
    }
}
