package kg.one.salon.Model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Clients extends BaseEntity {

    private String name;
    private String phone;
    private String pin;
}
