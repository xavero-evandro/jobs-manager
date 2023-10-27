package com.xavero.jobs_manager.modules.candidate.entities

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Pattern
import org.hibernate.validator.constraints.Length
import java.util.*

data class CandidateEntity(

    val id: UUID,

    val name: String,

    @Pattern(regexp = "^(?!\\s+$)", message = "Username should not have spaces")
    val username: String,

    @Email(message = "Email should be valid")
    val email: String,

    @Length(min = 8, message = "Password should be at least 8 characters")
    val password: String,

    val description: String,

    val curriculum: String,
)