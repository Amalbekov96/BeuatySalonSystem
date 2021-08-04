package kg.one.salon.Model.Dto;

import kg.one.salon.Model.Branches;
import lombok.Data;

@Data
public class PhonesDto extends BaseDto {


    private String phone;
    private BranchesDto branch;
}
