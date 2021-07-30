package kg.one.salon.Model.Dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class BaseEntityDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
