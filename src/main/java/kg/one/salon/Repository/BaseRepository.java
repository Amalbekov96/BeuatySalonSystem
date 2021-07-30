package kg.one.salon.Repository;

import kg.one.salon.Model.BaseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface BaseRepository<E extends BaseEntity> extends CrudRepository<E, Long> {
}
