package kg.one.salon.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class MastersWorkDays extends BaseEntity{

    @ManyToOne
    private Masters master;
    @OneToOne
    private Branches branch;
    private Date workDay;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Date addDate;
    private Date editDate;
    @ManyToOne
    private Admins admin_id;
}
