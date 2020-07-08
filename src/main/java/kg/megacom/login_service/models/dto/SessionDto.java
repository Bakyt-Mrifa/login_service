package kg.megacom.login_service.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SessionDto {
    private Long id;
    private String token;
    private Date startDate;
    private Date endDate;
    private UserDto userDtoId;
}
