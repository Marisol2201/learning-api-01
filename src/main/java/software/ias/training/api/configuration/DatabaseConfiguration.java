package software.ias.training.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.ias.training.api.test.Database;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public Database databaseBean() {
        return new Database();
    }
}
