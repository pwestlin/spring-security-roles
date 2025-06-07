package se.lantmateriet.springsecurityroles.controller

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import se.lantmateriet.springsecurityroles.service.AdminService
import java.security.Principal

@RestController
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
class AdminController(private val adminService: AdminService) {

    @GetMapping("/hello")
    fun adminHello(principal: Principal): String {
        return "Hej, ${principal.name}! Du har rollen ADMIN."
    }

    @GetMapping("/data")
    fun getAdminData(): String {
        return adminService.getAdminData()
    }
}
