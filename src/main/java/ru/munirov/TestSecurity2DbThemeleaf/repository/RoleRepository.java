package ru.munirov.TestSecurity2DbThemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.munirov.TestSecurity2DbThemeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}