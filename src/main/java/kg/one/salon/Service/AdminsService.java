package kg.one.salon.Service;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.AdminsDto;
import kg.one.salon.Model.Mapper.AdminsMapper;
import kg.one.salon.Repository.AdminsRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;



@Service
public class AdminsService extends BaseServiceImpl<Admins, AdminsDto, AdminsRepository, AdminsMapper> {


    public AdminsService(AdminsRepository repo, AdminsMapper mapper) {
        super(repo, mapper);
    }
}
