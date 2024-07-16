package kr.ac.kumoh.ce.s20220242.mysqldb.controller

import kr.ac.kumoh.ce.s20220242.mysqldb.entity.Review
import kr.ac.kumoh.ce.s20220242.mysqldb.service.ReviewService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/reviews")
class ReviewController @Autowired constructor(
    private val reviewService: ReviewService
) {
    @GetMapping
    fun getAllReviews(): List<Review> = reviewService.getAllReviews()

    @GetMapping("/{id}")
    fun getReviewById(@PathVariable id: Long): Review? = reviewService.getReviewById(id)

    @PostMapping
    fun createReview(@RequestBody review: Review): Review = reviewService.saveReview(review)

    @DeleteMapping("/{id}")
    fun deleteReview(@PathVariable id: Long) = reviewService.deleteReview(id)
}
