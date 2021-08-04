package kg.one.salon.Service.Base;

import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Dto.BaseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BaseService<E extends BaseEntity, D extends BaseDto> {
    D findById(Long id);
    void deleteById(Long id);
    ResponseEntity<?> update(D dto);
    ResponseEntity<?> create(D dto);
    ResponseEntity<?> findAll();
}
