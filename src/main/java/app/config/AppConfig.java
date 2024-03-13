package app.config;

import app.model.Animal;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name = "dogBean")
    public Animal getDog() {
        Animal animal = new Dog();
        return animal;
    }

    @Bean(name = "timer")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }
}
