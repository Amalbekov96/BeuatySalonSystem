package kg.one.salon.Model;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Masters extends BaseEntity {
    private String name;
}
