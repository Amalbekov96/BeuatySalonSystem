package kg.one.salon.Model.Dto;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.Clients;
import kg.one.salon.Model.MastersWorkDays;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservedHoursDto extends BaseDto{


    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private MastersWorkDaysDto workDayId;
    private ClientsDto clientId;
    private AdminsDto adminId;
}
