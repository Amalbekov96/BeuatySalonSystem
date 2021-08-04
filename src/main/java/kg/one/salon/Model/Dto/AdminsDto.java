package kg.one.salon.Model.Dto;

import kg.one.salon.Model.Enum.AdminStatus;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class AdminsDto extends BaseDto {


    private String name;
    private String login;
    private String password;
    private AdminStatus status;
}
