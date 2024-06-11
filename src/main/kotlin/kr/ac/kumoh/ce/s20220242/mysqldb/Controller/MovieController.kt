package kr.ac.kumoh.ce.s20220242.mysqldb.controller

import kr.ac.kumoh.ce.s20220242.mysqldb.entity.Movie
import kr.ac.kumoh.ce.s20220242.mysqldb.service.MovieService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/movies")
class MovieController @Autowired constructor(
    private val movieService: MovieService
) {
    @GetMapping
    fun getAllMovies(): List<Movie> = movieService.getAllMovies()

    @GetMapping("/{id}")
    fun getMovieById(@PathVariable id: Long): Movie? = movieService.getMovieById(id)

    @PostMapping
    fun createMovie(@RequestBody movie: Movie): Movie = movieService.saveMovie(movie)

    @DeleteMapping("/{id}")
    fun deleteMovie(@PathVariable id: Long) = movieService.deleteMovie(id)
}
