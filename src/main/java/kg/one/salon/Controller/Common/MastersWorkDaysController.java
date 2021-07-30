package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.MastersWorkDays;
import kg.one.salon.Service.AdminsService;
import kg.one.salon.Service.MastersWorkDaysService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/workdays")
public class MastersWorkDaysController extends BaseController<MastersWorkDays, MastersWorkDaysService> {
    protected MastersWorkDaysController(MastersWorkDaysService service) {
        super(service);
    }
}
