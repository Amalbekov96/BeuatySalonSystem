package kg.one.salon.Model.Dto;

import kg.one.salon.Model.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;


@Data
@Entity
public class SalonsDto extends BaseEntity {
    private String name;
    private Boolean active;
}
