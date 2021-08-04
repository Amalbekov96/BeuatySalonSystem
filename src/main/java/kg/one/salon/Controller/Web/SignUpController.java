package kg.one.salon.Controller.Web;

import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Dto.BranchesDto;
import kg.one.salon.Model.Dto.MastersWorkDaysDto;
import kg.one.salon.Model.Masters;
import kg.one.salon.Model.MastersWorkDays;
import kg.one.salon.Service.BranchesService;
import kg.one.salon.Service.MastersService;
import kg.one.salon.Service.MastersWorkDaysService;
import org.dom4j.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vp1")
public class SignUpController {

    @Autowired
    private BranchesService branchesService;
    @Autowired
    private MastersService mastersService;
    @Autowired
    private MastersWorkDaysService mastersWorkDaysService;

//    @GetMapping("/getBranches/{id}")
//    public @ResponseBody
//    List<BranchesDto> getBranches(@PathVariable("id") Long id){
//        return branchesService.findBySalonId(id);
//    }
//
//    @GetMapping("/getMastersAndHours/{branchId}/{masterId}")
//    public @ResponseBody
//    List<MastersWorkDaysDto> getMastersAndHours(@PathVariable("branchId") Long branchId, @PathVariable("masterId") Long masterId){
//        return mastersWorkDaysService.findBybranchIdAndMasterId(branchId, masterId);
//    }
}
