package kg.megacom.login_service.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue
    @Column(name="account_id")
    private Long id;
    private String login;
    private String password;
    private boolean isActive;
}
