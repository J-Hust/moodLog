package com.jhust.moodLog

import java.time.LocalDateTime
import javax.persistence.*


@Entity
data class Log(
        @Id @GeneratedValue val id: Long? = null,
        val score: Int,
        val thought: String,
        val createdDate: LocalDateTime,
        val lastModified: LocalDateTime,
        @ManyToOne val author: User,
        @ManyToMany val tag: Tag
)

@Entity
data class User(
        @Id @GeneratedValue val id: Long? = null,
        val firstName: String,
        val lastName: String,
        val email: String,
        val password: String
)

@Entity
data class Tag(
        @Id @GeneratedValue val id: Long? = null,
        val name: String
)