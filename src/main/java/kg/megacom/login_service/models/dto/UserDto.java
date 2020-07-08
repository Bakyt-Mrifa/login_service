package kg.megacom.login_service.models.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String address;
    private boolean isActive;
    private AccountDto accountDtoId;
    private RoleDto roleDtoId;
}
