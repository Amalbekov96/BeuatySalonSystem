package kg.one.salon.Service;

import kg.one.salon.Model.Dto.PhonesDto;
import kg.one.salon.Model.Mapper.PhonesMapper;
import kg.one.salon.Model.Phones;
import kg.one.salon.Repository.PhonesRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PhonesService extends BaseServiceImpl<Phones, PhonesDto, PhonesRepository, PhonesMapper> {
    public PhonesService(PhonesRepository repo, PhonesMapper mapper) {
        super(repo, mapper);
    }
}
