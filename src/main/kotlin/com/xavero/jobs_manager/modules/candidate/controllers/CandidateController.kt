package com.xavero.jobs_manager.modules.candidate.controllers

import com.xavero.jobs_manager.modules.candidate.entities.Candidate
import com.xavero.jobs_manager.modules.candidate.useCases.CreateCandidateUseCase
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/candidate")
class CandidateController(private val createCandidateUseCase: CreateCandidateUseCase) {

    @PostMapping
    fun create(@Validated @RequestBody candidateEntity: Candidate): ResponseEntity<Any> {
        try {
            val result = createCandidateUseCase.execute(candidateEntity)
            return ResponseEntity.ok(result)
        } catch (err: Exception) {
            return ResponseEntity.badRequest().body(object {
                val message = err.message
            })
        }
    }

    @GetMapping
    fun read() {
        println("read")
    }
}