package kg.megacom.login_service.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private Long id;
    private String name;
    private boolean isActive;
}
