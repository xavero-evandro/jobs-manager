package com.xavero.jobs_manager.modules.company.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.validator.constraints.Length
import java.util.*

@Entity()
data class Company(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    @NotBlank(message = "Name is required")
    var name: String,
    @Length(min = 6, max = 30, message = "Username should be between 6 and 30 characters")
    var username: String,
    @Email(message = "Email should be valid")
    var email: String,
    @NotBlank(message = "Password is required")
    @Length(min = 8, message = "Password should have at least 8 characters")
    var password: String,
    var website: String,
    var description: String,
    @CreationTimestamp
    val createdAt: Date = Date()
)