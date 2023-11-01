package com.xavero.jobs_manager.modules.company.entities

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.util.*

@Entity
data class Job(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    var description: String,
    var benefits: String,
    var level: String,

    @Column(name = "company_id")
    val companyId: UUID,

    @ManyToOne()
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    val company: Company,

    @CreationTimestamp
    val createdAt: Date = Date()
)