package kg.megacom.login_service.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "sessions")
public class Session {
    @Id
    @Column(name = "session_id")
    private Long id;
    private String token;
    private Date startDate;
    private Date endDate;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userId;
}
