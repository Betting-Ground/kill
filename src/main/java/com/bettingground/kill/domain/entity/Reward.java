package com.bettingground.kill.domain.entity;

import jakarta.persistence.*;

@Embeddable
public class Reward {
    @Column(name = "reward_product_token")
    private String productToken;
}
