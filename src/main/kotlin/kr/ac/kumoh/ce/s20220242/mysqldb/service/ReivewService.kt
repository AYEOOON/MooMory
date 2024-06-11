package kr.ac.kumoh.ce.s20220242.mysqldb.service

import kr.ac.kumoh.ce.s20220242.mysqldb.entity.Review
import kr.ac.kumoh.ce.s20220242.mysqldb.repository.ReviewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ReviewService @Autowired constructor(
    private val reviewRepository: ReviewRepository
) {
    fun getAllReviews(): List<Review> = reviewRepository.findAll()

    fun getReviewById(id: Long): Review? = reviewRepository.findById(id).orElse(null)

    fun saveReview(review: Review): Review = reviewRepository.save(review)

    fun deleteReview(id: Long) = reviewRepository.deleteById(id)
}
