package kr.ac.kumoh.ce.s20220242.mysqldb.service

import kr.ac.kumoh.ce.s20220242.mysqldb.entity.Movie
import kr.ac.kumoh.ce.s20220242.mysqldb.repository.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieService @Autowired constructor(
    private val movieRepository: MovieRepository
) {
    fun getAllMovies(): List<Movie> = movieRepository.findAll()

    fun getMovieById(id: Long): Movie? = movieRepository.findById(id).orElse(null)

    fun saveMovie(movie: Movie): Movie = movieRepository.save(movie)

    fun deleteMovie(id: Long) = movieRepository.deleteById(id)
}
