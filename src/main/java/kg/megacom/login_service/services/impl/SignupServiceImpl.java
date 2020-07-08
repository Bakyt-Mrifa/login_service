package kg.megacom.login_service.services.impl;

import kg.megacom.login_service.exception.IncorrectPassword;
import kg.megacom.login_service.exception.NoSuchUser;
import kg.megacom.login_service.mapping.SessionMapper;
import kg.megacom.login_service.models.dto.SessionDto;
import kg.megacom.login_service.models.entity.Account;
import kg.megacom.login_service.models.entity.Session;
import kg.megacom.login_service.repository.AccountRepository;
import kg.megacom.login_service.repository.SessionRepository;
import kg.megacom.login_service.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.UUID;

@Service
public class SignupServiceImpl implements SignUpService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private SessionRepository sessionRepository;
    @Override
    public SessionDto signUp(String login, String password) {
        Account account=accountRepository.findByLogin(login);
        if (account==null){
            throw new NoSuchUser("Пользователь не найден");
        }
        if (!account.getLogin().equals(password)){
            throw new IncorrectPassword("Неверный пароль!!!");
        }
        Calendar calendar=Calendar.getInstance();
        SessionDto sessionDto=new SessionDto();
        sessionDto.setToken(UUID.randomUUID().toString());
        sessionDto.setStartDate(calendar.getTime());
        calendar.add(Calendar.MINUTE,5);
        sessionDto.setEndDate(calendar.getTime());
        Session session= SessionMapper.INSTANCE.sessionDtoToSession(sessionDto);
        sessionRepository.save(session);
        sessionDto=SessionMapper.INSTANCE.sessionToSessionDto(session);
        return sessionDto;
    }
}
