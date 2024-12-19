package com.estd.tenders.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    private List<Tender> tenders;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Bid> bids;
}
