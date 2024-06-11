package kr.ac.kumoh.ce.s20220242.mysqldb.controller

import kr.ac.kumoh.ce.s20220242.mysqldb.entity.User
import kr.ac.kumoh.ce.s20220242.mysqldb.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController @Autowired constructor(
    private val userService: UserService
) {
    @GetMapping
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): User? = userService.getUserById(id)

    @PostMapping
    fun createUser(@RequestBody user: User): User = userService.saveUser(user)

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long) = userService.deleteUser(id)
}
