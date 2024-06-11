package kr.ac.kumoh.ce.s20220242.mysqldb.service

import kr.ac.kumoh.ce.s20220242.mysqldb.entity.User
import kr.ac.kumoh.ce.s20220242.mysqldb.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(
    private val userRepository: UserRepository
) {
    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUserById(id: Long): User? = userRepository.findById(id).orElse(null)

    fun saveUser(user: User): User = userRepository.save(user)

    fun deleteUser(id: Long) = userRepository.deleteById(id)
}
