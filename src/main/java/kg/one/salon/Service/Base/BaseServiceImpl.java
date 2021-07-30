package kg.one.salon.Service.Base;

import kg.one.salon.Exception.EntityNotFound;
import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BaseServiceImpl<E extends BaseEntity, R extends BaseRepository<E>> implements BaseService<E> {

    @Autowired
    private R repo;

    @Override
    public E findById(Long id) {
        return repo.findById(id).orElseThrow(()-> new EntityNotFound("Not found"));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public E update(E dto) {
        return repo.save(dto);
    }

    @Override
    public E create(E dto) {
        return repo.save(dto);
    }

    @Override
    public List<E> findAll() {
        return (List<E>) repo.findAll();
    }
}
