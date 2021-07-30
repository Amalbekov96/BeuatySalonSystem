package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Clients;
import kg.one.salon.Service.AdminsService;
import kg.one.salon.Service.ClientsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientsController extends BaseController<Clients, ClientsService> {
    protected ClientsController(ClientsService service) {
        super(service);
    }
}
