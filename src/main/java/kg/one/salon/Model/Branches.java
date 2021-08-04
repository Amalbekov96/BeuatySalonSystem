package kg.one.salon.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Branches extends BaseEntity{

    private String address;
    private double lat;
    private double lng;
    private Boolean active;
    @ManyToOne
    private Salons salon;
}
