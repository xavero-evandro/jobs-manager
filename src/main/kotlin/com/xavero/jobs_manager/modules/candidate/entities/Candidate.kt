package com.xavero.jobs_manager.modules.candidate.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.validator.constraints.Length
import java.util.*

@Entity
data class Candidate(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null,

    @NotBlank(message = "Name is mandatory")
    var name: String,

    @Pattern(regexp = "^[a-zA-Z0-9]+\$", message = "Username must be alphanumeric")
    var username: String,

    @Email(message = "Email must be valid")
    var email: String,

    @Length(min = 8, message = "Password must be at least 8 characters long")
    var password: String,

    var description: String,
    var curriculum: String,

    @CreationTimestamp
    var createdAt: Date = Date()
)