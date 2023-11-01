package com.xavero.jobs_manager.modules.candidate.repositories

import com.xavero.jobs_manager.modules.candidate.entities.Candidate
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CandidateRepository : JpaRepository<Candidate, UUID> {
    fun findByUsernameOrEmail(username: String, email: String): Optional<Candidate>
}