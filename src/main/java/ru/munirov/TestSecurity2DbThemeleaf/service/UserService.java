package ru.munirov.TestSecurity2DbThemeleaf.service;

import org.springframework.stereotype.Service;
import ru.munirov.TestSecurity2DbThemeleaf.dto.UserDto;
import ru.munirov.TestSecurity2DbThemeleaf.entity.User;

import java.util.List;

@Service
public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}