package kg.one.salon.Model.Dto;

import kg.one.salon.Model.Admins;
import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Masters;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Date;

public class MastersWorkDaysDto extends BaseEntity {

    private Masters master_id;
    private Branches branch_id;
    private Date workDay;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Date addDate;
    private Date editDate;
    private Admins admin_id;
}
