package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 65981149772133526L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "ENABLED", columnDefinition = "BIT", length = 1)
    private boolean enabled;

    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    protected Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)

    protected Date modifiedDate;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public void addRole(Role role) {
        roles.add(role);
        role.getUsers().add(this);
    }

    public void removeRole(Role role) {
        roles.remove(role);
        role.getUsers().remove(this);
    }

}
