package kg.one.salon.Repository;

import kg.one.salon.Model.ReservedHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedHoursRepository extends BaseRepository<ReservedHours> {
}
