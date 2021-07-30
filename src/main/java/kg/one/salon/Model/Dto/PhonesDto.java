package kg.one.salon.Model.Dto;

import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Branches;

import javax.persistence.OneToOne;

public class PhonesDto extends BaseEntity {
    private String phone;
    private Branches branch;
}
