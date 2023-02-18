package com.example.UserManagementSystem15feb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user_tbl")
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name="user_name")
    private String username;
    @Column(name = "date_of_birth")
    @NotNull(message = "Date of Birth is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message =" Date of Birth must be yyyy-MM-dd format")
    private String dateOfbirth;
    @Column(name = "email")
    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid email format")
    private String email;
    @Column(name = "ph_number")
    @NotBlank(message = "phone number is required")
    @Pattern(regexp = "^\\+\\d{2}\\d{10}$")
    private String phNumber;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;
}
