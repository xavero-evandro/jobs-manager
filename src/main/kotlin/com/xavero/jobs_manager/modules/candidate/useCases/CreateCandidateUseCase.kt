package com.xavero.jobs_manager.modules.candidate.useCases

import com.xavero.jobs_manager.exceptions.UserFoundException
import com.xavero.jobs_manager.modules.candidate.entities.Candidate
import com.xavero.jobs_manager.modules.candidate.repositories.CandidateRepository
import org.springframework.stereotype.Service

@Service
class CreateCandidateUseCase(private val candidateRepository: CandidateRepository) {

    fun execute(candidateEntity: Candidate): Candidate {
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.username, candidateEntity.email)
            .ifPresent { throw UserFoundException() }
        return candidateRepository.save(candidateEntity)
    }
}