package com.xavero.jobs_manager.modules.candidate.controllers

import com.xavero.jobs_manager.modules.candidate.entities.CandidateEntity
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/candidate")
class CandidateController {

    @PostMapping("")
    fun create(@Valid @RequestBody candidateEntity: CandidateEntity) {
        println(candidateEntity.email)
    }

    @GetMapping("")
    fun read() {
        println("read")
    }
}