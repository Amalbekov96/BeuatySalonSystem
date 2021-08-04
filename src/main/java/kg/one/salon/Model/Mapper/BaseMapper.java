package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.BaseEntity;
import kg.one.salon.Model.Dto.BaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.persistence.MappedSuperclass;
import java.util.List;


public interface BaseMapper<E extends BaseEntity, D extends BaseDto> {
    E toEntity(D d);
    D toDto(E e);
    List<E> toListEntity(List<D> d);
    List<D> toListDto(List<E> e);
}
