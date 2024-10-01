package com.bettingground.kill.domain.entity;

import jakarta.persistence.*;

@Embeddable
public class Player {
    @Column(name = "player_user_token")
    private String userToken;
}
