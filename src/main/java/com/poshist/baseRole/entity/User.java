package com.poshist.baseRole.entity;

import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Set;
/**
 * Created by server on 17-5-12.
 */
@Entity
@Table(name = "BR_T_USER_INFO")
@EntityListeners(AuditingEntityListener.class)
public class User extends AbstractEntity implements UserDetails {
  private String userName;
  private  String sysname;
  private String pwd;
  private String mobile;
  private String email;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private Set<Role> roles;


  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }



  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getSysname() {
    return sysname;
  }

  public void setSysname(String sysname) {
    this.sysname = sysname;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
//   for (Role role:roles){
//
//    }
    return null;
  }

  @Override
  public String getPassword() {
    return getPwd();
  }

  @Override
  public String getUsername() {
    return getSysname();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return  true;
  }
}
