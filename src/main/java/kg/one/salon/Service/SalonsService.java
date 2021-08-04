package kg.one.salon.Service;

import kg.one.salon.Model.Dto.SalonsDto;
import kg.one.salon.Model.Mapper.SalonsMapper;
import kg.one.salon.Model.Salons;
import kg.one.salon.Repository.SalonsRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SalonsService  extends BaseServiceImpl<Salons, SalonsDto, SalonsRepository, SalonsMapper> {

    public SalonsService(SalonsRepository repo, SalonsMapper mapper) {
        super(repo, mapper);
    }
}
