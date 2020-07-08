package kg.megacom.login_service.controllers;

import kg.megacom.login_service.models.dto.SessionDto;
import kg.megacom.login_service.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/session/")
public class SessionController {
    @Autowired
    private SignUpService signUpService;

    @GetMapping("auth")
    public SessionDto auth(@RequestParam String login, @RequestParam String password){
        return signUpService.signUp(login, password);
    }

    @GetMapping("out")
    public boolean logOut(@RequestHeader("a uth") String auth){
        return false;
    }

    @GetMapping("check")
    public boolean checkSession(@RequestHeader("auth") String auth){
        return false;
    }
}
