package se.lantmateriet.springsecurityroles.service

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.stereotype.Service

@Service
@PreAuthorize("hasRole('ADMIN')")
class AdminService {

    fun getAdminData(): String {
        return "Detta är skyddad data endast för användare med rollen ADMIN."
    }
}
