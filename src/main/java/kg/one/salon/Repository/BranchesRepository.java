package kg.one.salon.Repository;

import kg.one.salon.Model.Branches;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchesRepository extends BaseRepository<Branches> {
    List<Branches> findALlBySalonId(Long id);
}
