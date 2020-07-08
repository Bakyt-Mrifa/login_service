package kg.megacom.login_service.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="phones")
public class Phone {
    @Id
    @GeneratedValue
    @Column(name="phone_id")
    private Long id;
    private String phoneNum;
    private boolean isActive;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userId;
}
