package flower.store.controller;

import flower.store.Flower;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")  // Sets a base URL for all endpoints in this controller
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower("Rose", FlowerColor.RED, 10.0));
    }
}
