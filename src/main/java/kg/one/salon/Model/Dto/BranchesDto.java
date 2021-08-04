package kg.one.salon.Model.Dto;

import kg.one.salon.Model.Salons;
import lombok.Data;

@Data
public class BranchesDto extends BaseDto
 {
    private String address;
    private double lat;
    private double lng;
    private Boolean active;
    private SalonsDto salon;
}
