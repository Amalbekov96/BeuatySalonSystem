package kg.one.salon.Model;

import lombok.Data;

import javax.persistence.Entity;


@Data
@Entity
public class Salons extends BaseEntity {
    private String name;
    private Boolean active;
}
