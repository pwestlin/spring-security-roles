package se.lantmateriet.springsecurityroles.service

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.stereotype.Service

@Service
class UserService {

    @PreAuthorize("hasRole('USER')")
    fun getUserData(): String {
        return "Detta är skyddad data endast för användare med rollen USER."
    }
}
