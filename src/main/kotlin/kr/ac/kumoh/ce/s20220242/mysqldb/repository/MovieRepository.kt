package kr.ac.kumoh.ce.s20220242.mysqldb.repository

import kr.ac.kumoh.ce.s20220242.mysqldb.entity.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : JpaRepository<Movie, Long>
