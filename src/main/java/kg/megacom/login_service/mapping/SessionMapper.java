package kg.megacom.login_service.mapping;

import kg.megacom.login_service.models.dto.SessionDto;
import kg.megacom.login_service.models.entity.Session;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionMapper {

    SessionMapper INSTANCE= Mappers.getMapper(SessionMapper.class);
    Session sessionDtoToSession(SessionDto sessionDto);
    SessionDto sessionToSessionDto(Session session);
    void updateFromDto (SessionDto sessionDto, @MappingTarget Session session);
}
