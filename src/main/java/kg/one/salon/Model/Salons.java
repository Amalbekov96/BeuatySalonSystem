package kg.one.salon.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class Salons extends BaseEntity {

    private String name;
    private Boolean active;
}
