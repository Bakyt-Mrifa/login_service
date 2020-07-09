package kg.megacom.login_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.LOCKED)
public class UserInBlock extends RuntimeException {
    public UserInBlock(String message) {
        super(message);
    }
}
