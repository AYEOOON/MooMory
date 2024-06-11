package kr.ac.kumoh.ce.s20220242.mysqldb.repository

import kr.ac.kumoh.ce.s20220242.mysqldb.entity.Review
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : JpaRepository<Review, Long>
