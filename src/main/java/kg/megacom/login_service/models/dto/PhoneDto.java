package kg.megacom.login_service.models.dto;

import lombok.Data;

@Data
public class PhoneDto {
    private Long id;
    private String phoneNum;
    private boolean isActive;
    private UserDto userDtoId;
}
