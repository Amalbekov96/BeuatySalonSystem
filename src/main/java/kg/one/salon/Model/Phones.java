package kg.one.salon.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Phones extends BaseEntity{

    private String phone;
    @OneToOne
    private Branches branch;
}
