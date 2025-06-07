package se.lantmateriet.springsecurityroles.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import se.lantmateriet.springsecurityroles.service.UserService
import java.security.Principal

@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {

    @GetMapping("/hello")
    fun userHello(principal: Principal): String {
        return "Hej, ${principal.name}! Du har rollen USER."
    }

    @GetMapping("/data")
    fun getUserData(): String {
        return userService.getUserData()
    }
}
