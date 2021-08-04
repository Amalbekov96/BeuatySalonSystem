package kg.one.salon.Repository;

import kg.one.salon.Model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends BaseRepository<Clients> {
}
