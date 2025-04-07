package backend.user;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(1L, "madhav.malladi25@gmail.com", "Madhav Malladi", "madhav.m_", "password"));
    }
}
