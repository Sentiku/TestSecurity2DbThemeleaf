package ru.munirov.TestSecurity2DbThemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.munirov.TestSecurity2DbThemeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
