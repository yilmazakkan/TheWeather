package com.yilmazakkan.TheWeather.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_roles")
public class UserRole {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role_name")
    private String roleName;

    @JoinColumn(name = "user_id")
    @ManyToMany(fetch = FetchType.LAZY)
    private List<User> users;

    public UserRole(int id, String roleName, List<User> users) {
        this.id = id;
        this.roleName= roleName;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
