package kg.one.salon.Controller.Common;

import kg.one.salon.Controller.BaseController;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Dto.MastersWorkDaysDto;
import kg.one.salon.Model.MastersWorkDays;
import kg.one.salon.Service.AdminsService;
import kg.one.salon.Service.MastersWorkDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/workdays")
public class MastersWorkDaysController extends BaseController<MastersWorkDays, MastersWorkDaysDto, MastersWorkDaysService> {
    protected MastersWorkDaysController(MastersWorkDaysService service) {
        super(service);
    }

    private MastersWorkDaysService service;

    @Autowired
    public MastersWorkDaysController(MastersWorkDaysService service, MastersWorkDaysService service1) {
        super(service);
        this.service = service1;
    }

    @GetMapping("/allMasters/{id}")
    public ResponseEntity<?> findAllMasters(@PathVariable("id") Long id){
        return service.findAllByBranchId(id);
    }

    @GetMapping("/allMasters/{date}")
    public ResponseEntity<?> findByWorkDay(@PathVariable("date") LocalDate date){
        return service.findByWorkDay(date);
    }

    @GetMapping("/AllMastersByDate")
    public ResponseEntity<?> findAllByBranchIdAndWorkDate(@RequestParam Long BranchId, @RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date){
        return service.findByBranchIdAndDate(BranchId,date);
    }
}
