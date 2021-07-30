package kg.one.salon.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class ReservedHours extends BaseEntity{
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private MastersWorkDays workDayId;
    @ManyToOne
    private Clients clientId;
    @ManyToOne
    private Admins adminId;
}
