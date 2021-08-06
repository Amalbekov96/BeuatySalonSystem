package kg.one.salon.Service.Base;

import kg.one.salon.Exception.EntityNotFound;
import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Dto.BaseDto;
import kg.one.salon.Model.Mapper.BaseMapper;
import kg.one.salon.Repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.MappedSuperclass;
@Service
@MappedSuperclass
public abstract class BaseServiceImpl<E extends BaseEntity, D extends BaseDto, R extends BaseRepository<E>, M extends BaseMapper<E, D>> implements BaseService<E, D>{



    private R repo;
    private M mapper;

    @Autowired
    public BaseServiceImpl(R repo, M mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public D findById(Long id) {
        E e = repo.findById(id).orElseThrow(()-> new EntityNotFound("Entity was not found!"));
        return mapper.toDto(e);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public ResponseEntity<?> update(D d) {
        try {
            return ResponseEntity.ok(mapper.toDto(repo.save(mapper.toEntity(d))));
        } catch (Exception e){
            e.printStackTrace();
            throw new EntityNotFound("Could not update the Entity");
        }
    }

    @Override
    public ResponseEntity<?> create(D d){

        try {
            return ResponseEntity.ok(mapper.toDto(repo.save(mapper.toEntity(d))));
        } catch (Exception e){
            e.printStackTrace();
            throw new EntityNotFound("Could not save the Entity");
        }
    }

    @Override
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(mapper.toListDto(repo.findAll()));
    }
}
