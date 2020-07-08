package kg.megacom.login_service.models.dto;

import lombok.Data;

@Data
public class RoleDto {
    private Long id;
    private String name;
    private boolean isActive;
}
