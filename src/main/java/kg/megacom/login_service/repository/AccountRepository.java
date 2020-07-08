package kg.megacom.login_service.repository;

import kg.megacom.login_service.models.entity.Account;
import kg.megacom.login_service.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findByLogin(String login);
}
