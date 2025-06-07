# Spring Security med roller för både URL:ar och services

## Testa med curl
Testa /user endpoint med user-uppgifter (ska lyckas):
```bash
curl -u user:password http://localhost:8080/user/hello
# Förväntat svar: Hej, user! Du har rollen USER.
```
```bash
curl -u user:password http://localhost:8080/user/data
# Förväntat svar: Detta är skyddad data endast för användare med rollen USER.
```
Testa /admin endpoint med admin-uppgifter (ska lyckas):
```bash
curl -u admin:password http://localhost:8080/admin/hello
# Förväntat svar: Hej, admin! Du har rollen ADMIN.
```
```bash
curl -u admin:password http://localhost:8080/admin/data
# Förväntat svar: Detta är skyddad data endast för användare med rollen ADMIN.
```
Testa /admin endpoint med user-uppgifter (ska misslyckas):
```bash
curl -i -u user:password http://localhost:8080/admin/hello
# Förväntat svar: HTTP/1.1 403 Forbidden
```
Testa utan autentisering (ska misslyckas):
```bash
curl -i http://localhost:8080/user/hello
# Förväntat svar: HTTP/1.1 401 Unauthorized
```
