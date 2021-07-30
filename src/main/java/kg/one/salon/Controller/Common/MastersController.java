package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Masters;
import kg.one.salon.Service.AdminsService;
import kg.one.salon.Service.MastersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/masters")
public class MastersController extends BaseController<Masters, MastersService> {
    protected MastersController(MastersService service) {
        super(service);
    }
}
