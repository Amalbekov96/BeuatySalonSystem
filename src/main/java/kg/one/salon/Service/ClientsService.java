package kg.one.salon.Service;

import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Clients;
import kg.one.salon.Repository.BranchesRepository;
import kg.one.salon.Repository.ClientsRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ClientsService extends BaseServiceImpl<Clients, ClientsRepository> {
}
