package com.xavero.jobs_manager.modules.candidate.entities

import java.util.UUID

data class CandidateEntity(
    val id: UUID,
    val name: String,
    val username: String,
    val email: String,
    val password: String,
    val description: String,
    val curriculum: String,
)