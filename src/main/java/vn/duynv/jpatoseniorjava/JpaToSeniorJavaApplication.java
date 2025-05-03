package vn.duynv.jpatoseniorjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaToSeniorJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaToSeniorJavaApplication.class, args);
    }

}
