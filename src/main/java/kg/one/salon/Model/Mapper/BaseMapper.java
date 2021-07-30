package kg.one.salon.Model.Mapper;

import org.mapstruct.factory.Mappers;

import java.util.List;

public interface BaseMapper<E, D> {
    BaseMapper INSTANCE = Mappers.getMapper(BaseMapper.class);
    E toEntity(D d);
    D toDto(E e);
    List<E> toListEntity(List<D> d);
    List<D> toListDto(List<E> e);
}
