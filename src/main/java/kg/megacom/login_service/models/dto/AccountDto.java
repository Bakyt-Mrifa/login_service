package kg.megacom.login_service.models.dto;

import lombok.Data;

@Data
public class AccountDto {

    private Long id;
    private String login;
    private String password;
    private boolean isActive;
}
