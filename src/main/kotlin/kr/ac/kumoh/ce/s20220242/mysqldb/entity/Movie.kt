package kr.ac.kumoh.ce.s20220242.mysqldb.entity

import jakarta.persistence.*
import java.util.*

@Entity
data class Movie(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String,
    val genre: String,
    @Column(name = "Release_Date")
    val releaseDate: Date,
    @Column(columnDefinition = "TEXT")
    val story: String?
)
