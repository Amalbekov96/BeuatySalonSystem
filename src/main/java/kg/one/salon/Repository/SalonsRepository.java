package kg.one.salon.Repository;

import kg.one.salon.Model.Salons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonsRepository extends BaseRepository<Salons> {
}
