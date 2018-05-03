package com.makooslee.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "tbl_user")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "login_name")
    @NotNull
    @Size(min =1, max = 60)
    private String loginName;

    @Column(name = "user_name")
    @NotNull
    @Size(min =1, max = 60)
    private String userName;

    @Column(name="passwd")
    @NotNull
    @Size(min =1, max = 60)
    private String password;

    @Column(name = "email")
    @NotNull
    @Size(min =1, max = 60)
    private String email;

}
