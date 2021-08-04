package kg.one.salon.Repository;

import kg.one.salon.Model.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepository extends BaseRepository<Admins> {

}
