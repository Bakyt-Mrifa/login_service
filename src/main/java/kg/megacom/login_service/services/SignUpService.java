package kg.megacom.login_service.services;

import kg.megacom.login_service.models.dto.SessionDto;

public interface SignUpService {
    SessionDto signUp (String login, String password);
}
