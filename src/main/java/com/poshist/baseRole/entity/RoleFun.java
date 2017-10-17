package com.poshist.baseRole.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "BR_T_ROLE_FUN")
@EntityListeners(AuditingEntityListener.class)
public class RoleFun extends AbstractEntity
{
    @ManyToOne
    private Role role;
    @ManyToOne
    private Function function;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }
}
