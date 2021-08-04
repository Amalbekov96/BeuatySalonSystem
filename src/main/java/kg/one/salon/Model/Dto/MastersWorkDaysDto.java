package kg.one.salon.Model.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Masters;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class MastersWorkDaysDto extends BaseDto{


    private MastersDto master_id;
    private BranchesDto branch_id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate workDay;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
    private AdminsDto admin_id;
}
