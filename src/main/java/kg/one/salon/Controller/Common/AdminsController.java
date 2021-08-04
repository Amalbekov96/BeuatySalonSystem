package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.AdminsDto;
import kg.one.salon.Service.AdminsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminsController extends BaseController<Admins,AdminsDto, AdminsService> {
    protected AdminsController(AdminsService service) {
        super(service);
    }
}
