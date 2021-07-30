package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Branches;
import kg.one.salon.Service.AdminsService;
import kg.one.salon.Service.BranchesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/branches")
public class BranchesController extends BaseController<Branches, BranchesService> {
    protected BranchesController(BranchesService service) {
        super(service);
    }
}
