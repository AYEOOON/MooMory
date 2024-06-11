package kr.ac.kumoh.ce.s20220242.mysqldb.entity

import jakarta.persistence.*
import java.util.*

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val username: String,
    val password: String,
    val email: String,
    val role: String = "user"
)
