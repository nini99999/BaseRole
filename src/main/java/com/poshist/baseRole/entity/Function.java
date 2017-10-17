package com.poshist.baseRole.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@Table(name = "BR_T_FUNCTION")
@EntityListeners(AuditingEntityListener.class)
public class Function  extends AbstractEntity {
    private String name;
    private String link;
}
