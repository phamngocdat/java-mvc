package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HellController {
    @GetMapping("/")
    public String index() {
        return "hello";
    }
}
