package kg.one.salon.Model;

import com.fasterxml.jackson.databind.ser.Serializers;
import kg.one.salon.Model.Enum.AdminStatus;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Admins extends BaseEntity {

    private String name;
    private String login;
    private String password;
    private AdminStatus status;
}
