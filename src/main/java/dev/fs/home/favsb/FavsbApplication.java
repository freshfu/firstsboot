package dev.fs.home.favsb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"dev.fs.home.favsb.controllers","dev.fs.home.favsb.services"})
@MapperScan(value = "dev.fs.home.favsb.dao")
public class FavsbApplication {

    public static void main(String[] args) {
        SpringApplication.run(FavsbApplication.class, args);
    }

}
