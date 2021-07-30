package kg.one.salon.Model.Dto;

import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Salons;

import javax.persistence.ManyToOne;

public class BranchesDto extends BaseEntity {

    private String address;
    private double lat;
    private double lng;
    private Boolean active;
    private Salons salon;
}
