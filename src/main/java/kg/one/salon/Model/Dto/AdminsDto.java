package kg.one.salon.Model.Dto;

import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Enum.AdminStatus;
import lombok.Data;

@Data
public class AdminsDto extends BaseEntityDto{

    private String name;
    private String login;
    private String password;
    private AdminStatus status;
}
