package kg.one.salon.Controller;

import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Dto.BaseDto;
import kg.one.salon.Service.Base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public abstract class BaseController <E extends BaseEntity, D extends BaseDto, S extends BaseService<E, D>>{

    private final S service;

    protected BaseController(S service) {
        this.service = service;
    }

    @GetMapping("/findById/{id}")
    D findById(@PathVariable Long id) {return this.service.findById(id);}

    @PutMapping("/update")
    ResponseEntity<?> update(@RequestBody D d){return  this.service.update(d);}

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody D d){return this.service.create(d);}

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){ this.service.deleteById(id);}

    @GetMapping("/findAll")
    ResponseEntity<?> findAll(){ return this.service.findAll();}
}
