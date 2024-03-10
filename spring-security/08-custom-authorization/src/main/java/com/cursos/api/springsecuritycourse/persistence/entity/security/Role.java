package com.cursos.api.springsecuritycourse.persistence.entity.security;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /* EAGER -> obtiene todos de una
    * LAZY -> default para colecciones */

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY) // en grantedPermission debe tener un atributo role
    private List<GrantedPermission> permissions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GrantedPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<GrantedPermission> permissions) {
        this.permissions = permissions;
    }
}