package kr.ac.kumoh.ce.s20220242.mysqldb.entity

import jakarta.persistence.*

@Entity
data class Review(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(columnDefinition = "TEXT")
    val memory: String,
    @Column(name = "Write_Date")
    val writeDate: String,

    @ManyToOne @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @ManyToOne @JoinColumn(name = "Movie_id", nullable = false)
    val movie: Movie
)
