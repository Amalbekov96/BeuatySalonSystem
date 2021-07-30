package kg.one.salon.Model;


import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Clients extends BaseEntity {

    private String name;
    private String phone;
    private String pin;
}
