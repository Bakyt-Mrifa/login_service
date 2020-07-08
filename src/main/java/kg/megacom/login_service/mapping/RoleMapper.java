package kg.megacom.login_service.mapping;

import kg.megacom.login_service.models.dto.RoleDto;
import kg.megacom.login_service.models.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
    Role roleDtoToRole(RoleDto roleDto);
    RoleDto roleToRoleDto(Role role);
    void updateRoleFromDto(RoleDto roleDto, @MappingTarget Role role);
}
