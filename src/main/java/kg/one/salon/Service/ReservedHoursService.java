package kg.one.salon.Service;

import kg.one.salon.Model.Phones;
import kg.one.salon.Model.ReservedHours;
import kg.one.salon.Repository.PhonesRepository;
import kg.one.salon.Repository.ReservedHoursRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ReservedHoursService extends BaseServiceImpl<ReservedHours, ReservedHoursRepository> {
}
