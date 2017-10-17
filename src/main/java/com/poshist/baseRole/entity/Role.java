package com.poshist.baseRole.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "BR_T_ROLE")
@EntityListeners(AuditingEntityListener.class)
public class Role  extends AbstractEntity {
    private String roleName;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<RoleFun> roleFun;

    public Set<RoleFun> getRoleFun() {
        return roleFun;
    }

    public void setRoleFun(Set<RoleFun> roleFun) {
        this.roleFun = roleFun;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
