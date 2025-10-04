package com.he110w0r1d.business;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Users")  // 👈 bảng trong DB
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL AUTO_INCREMENT
    @Column(name = "UserID")  // 👈 đúng tên cột
    private Long userId;

    @Column(name = "EmailAddress")  // 👈 DB đang để EmailAddress, không phải email
    private String email;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    public User() {}

    // Getter và Setter
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
