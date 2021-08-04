package kg.one.salon.Model.Mapper.Impl;

import kg.one.salon.Model.Dto.PhonesDto;
import kg.one.salon.Model.Mapper.PhonesMapper;
import kg.one.salon.Model.Phones;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhonesMapperImpl implements PhonesMapper {
    @Override
    public Phones toEntity(PhonesDto phonesDto) {
        return PhonesMapper.INSTANCE.toEntity(phonesDto);
    }

    @Override
    public PhonesDto toDto(Phones phones) {
        return PhonesMapper.INSTANCE.toDto(phones);
    }

    @Override
    public List<Phones> toListEntity(List<PhonesDto> d) {
        return PhonesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<PhonesDto> toListDto(List<Phones> e) {
        return PhonesMapper.INSTANCE.toListDto(e);
    }
}
