package flower.store.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import flower.store.Flower;
import flower.store.FlowerColor;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping("/list")
    public List<Flower> getFlower() {
        double sepalLength = 11.5;
        double price = 11.5;
        Flower flower = new Flower();
        flower.setPrice(price);
        flower.setSepalLength(sepalLength);
        flower.setColor(FlowerColor.RED);
        
        return List.of(flower);
    }
}
