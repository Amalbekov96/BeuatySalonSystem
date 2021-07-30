package kg.one.salon.Model.Dto;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Clients;
import kg.one.salon.Model.MastersWorkDays;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class ReservedHoursDto extends BaseEntity {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private MastersWorkDays workDayId;
    private Clients clientId;
    private Admins adminId;
}
