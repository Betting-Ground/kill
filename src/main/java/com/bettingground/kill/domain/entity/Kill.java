package com.bettingground.kill.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "kills4")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Kill extends BaseEntity {

    private static final String KILL_TOKEN_PREFIX = "kill_";

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "kill_id")
    private Long id;
    private String killToken;
    @Embedded
    private Player player;
    @Embedded
    private Target target;
    @Embedded
    private Reward reward;
    @Column(nullable = false, updatable = false)
    @Embedded
    private LastAttack attack;

}
