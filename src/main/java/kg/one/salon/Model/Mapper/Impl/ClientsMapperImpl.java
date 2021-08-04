package kg.one.salon.Model.Mapper.Impl;

import kg.one.salon.Model.Clients;
import kg.one.salon.Model.Dto.ClientsDto;
import kg.one.salon.Model.Mapper.ClientsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsMapperImpl implements ClientsMapper {
    @Override
    public Clients toEntity(ClientsDto clientsDto) {
        return ClientsMapper.INSTANCE.toEntity(clientsDto);
    }

    @Override
    public ClientsDto toDto(Clients clients) {
        return ClientsMapper.INSTANCE.toDto(clients);
    }

    @Override
    public List<Clients> toListEntity(List<ClientsDto> d) {
        return ClientsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<ClientsDto> toListDto(List<Clients> e) {
        return ClientsMapper.INSTANCE.toListDto(e);
    }
}
