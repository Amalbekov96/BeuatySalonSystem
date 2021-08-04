package kg.one.salon.Service;

import kg.one.salon.Model.Dto.ReservedHoursDto;
import kg.one.salon.Model.Mapper.ReservedHoursMapper;
import kg.one.salon.Model.ReservedHours;
import kg.one.salon.Repository.ReservedHoursRepository;
import kg.one.salon.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ReservedHoursService extends BaseServiceImpl<ReservedHours, ReservedHoursDto, ReservedHoursRepository, ReservedHoursMapper> {
    public ReservedHoursService(ReservedHoursRepository repo, ReservedHoursMapper mapper) {
        super(repo, mapper);
    }
}
