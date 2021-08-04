package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.PhonesDto;
import kg.one.salon.Model.Phones;
import kg.one.salon.Service.AdminsService;
import kg.one.salon.Service.PhonesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/phones")
public class PhonesController extends BaseController<Phones, PhonesDto, PhonesService> {
    protected PhonesController(PhonesService service) {
        super(service);
    }
}
