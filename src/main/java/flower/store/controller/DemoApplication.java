package flower.store.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import flower.store.Flower;
import flower.store.FlowerColor;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(new Flower("Rose", FlowerColor.RED, 10.0));
    }
}
