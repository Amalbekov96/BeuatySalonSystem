package kg.one.salon.Repository;

import kg.one.salon.Model.ReservedHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservedHoursRepository extends BaseRepository<ReservedHours> {
    List<ReservedHours> findAllByWorkDayIdId(Long id);
}
