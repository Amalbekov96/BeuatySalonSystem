package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.ReservedHoursDto;
import kg.one.salon.Model.Mapper.ReservedHoursMapper;
import kg.one.salon.Model.ReservedHours;
import kg.one.salon.Service.AdminsService;
import kg.one.salon.Service.ReservedHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hours")
public class ReservedHoursController extends BaseController<ReservedHours, ReservedHoursDto, ReservedHoursService> {
    protected ReservedHoursController(ReservedHoursService service) {
        super(service);
    }

    @Autowired
    private ReservedHoursService service;

    @GetMapping("/getByWorkDayId")
    public ResponseEntity<?> findAllByWorkDayId(@RequestParam Long id){
        return ResponseEntity.ok(service.findAllByWorkDayId(id));
    }
}
