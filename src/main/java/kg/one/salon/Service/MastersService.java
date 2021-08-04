package kg.one.salon.Service;

import kg.one.salon.Model.Dto.MastersDto;
import kg.one.salon.Model.Mapper.MastersMapper;
import kg.one.salon.Model.Masters;
import kg.one.salon.Repository.MastersRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MastersService extends BaseServiceImpl<Masters, MastersDto, MastersRepository, MastersMapper> {

    public MastersService(MastersRepository repo, MastersMapper mapper) {
        super(repo, mapper);
    }
}
