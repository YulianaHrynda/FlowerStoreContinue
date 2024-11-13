package flower.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliverController {

    @GetMapping("/dhl")
    public String getDHL() {
        return "DHL delivery method.";
    }

    @GetMapping("/post")
    public String getPost() {
        return "Post delivery method.";
    }
}