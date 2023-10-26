package com.xavero.jobs_manager.modules.candidate.controllers

import com.xavero.jobs_manager.modules.candidate.entities.CandidateEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/candidate")
class CandidateController {

    @PostMapping("/")
    fun create(@RequestBody candidateEntity: CandidateEntity) {
        println(candidateEntity.email)
    }
}