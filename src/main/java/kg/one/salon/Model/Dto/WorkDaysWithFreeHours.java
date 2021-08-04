package kg.one.salon.Model.Dto;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Masters;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Data
public class WorkDaysWithFreeHours extends BaseDto{
    private Masters master_id;
    private Branches branch_id;
    private LocalDate workDay;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
    private Admins admin_id;
    private ReservedHoursDto hours;
}
