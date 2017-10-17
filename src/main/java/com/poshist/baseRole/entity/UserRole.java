package com.poshist.baseRole.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
@Entity
@Table(name = "BR_T_ROLE")
@EntityListeners(AuditingEntityListener.class)
public class UserRole extends AbstractEntity {
    private User user;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
