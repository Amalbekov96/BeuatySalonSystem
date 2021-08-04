package kg.one.salon.Model.Mapper;

import kg.one.salon.Model.Branches;
import kg.one.salon.Model.Clients;
import kg.one.salon.Model.Dto.BranchesDto;
import kg.one.salon.Model.Dto.ClientsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ClientsMapper extends BaseMapper<Clients, ClientsDto> {
    ClientsMapper INSTANCE = Mappers.getMapper(ClientsMapper.class);
}
