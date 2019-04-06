package com.mis.marcin.boot_app.models;


import com.mis.marcin.boot_app.validation.annotations.PasswordCheck;
import com.mis.marcin.boot_app.validation.annotations.UniqueCheck;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class User {

    @Id
    private long id;

    @NotNull(message = "{validation.mail.notEmpty}")
    @NotBlank(message = "incorrect login")
    @Column(unique = true)
    @UniqueCheck(message = "xdxdxdxd")
    private String username;

    @NotNull(message = "incorrect email")
    @NotBlank(message = "incorrect email")
    @Email(message = "incorrect email")
    @UniqueCheck(message = "xdxdxdx")
    private String email;

    @PasswordCheck(message = "incorrect passwordxdd")
    private String password;

    @CreatedDate
    private Date registrationDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
