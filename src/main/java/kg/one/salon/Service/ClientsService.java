package kg.one.salon.Service;

import kg.one.salon.Model.Clients;
import kg.one.salon.Model.Dto.ClientsDto;
import kg.one.salon.Model.Mapper.ClientsMapper;
import kg.one.salon.Repository.ClientsRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ClientsService extends BaseServiceImpl<Clients, ClientsDto, ClientsRepository, ClientsMapper> {
    public ClientsService(ClientsRepository repo, ClientsMapper mapper) {
        super(repo, mapper);
    }
}
