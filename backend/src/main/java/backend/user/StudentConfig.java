package backend.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User madhav = new User(
                    "madhav.malladi25@gmail.com",
                    "Madhav Malladi",
                    "madhavmalladi",
                    "password");
            User example2 = new User(
                    "example2@gmail.com",
                    "Example 2",
                    "example2",
                    "password");
            repository.saveAll(List.of(madhav, example2));
        };
    }
}
