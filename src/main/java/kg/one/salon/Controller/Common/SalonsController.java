package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.SalonsDto;
import kg.one.salon.Model.Salons;
import kg.one.salon.Service.AdminsService;
import kg.one.salon.Service.SalonsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/salon")
public class SalonsController extends BaseController<Salons, SalonsDto, SalonsService> {
    protected SalonsController(SalonsService service) {
        super(service);
    }
}
