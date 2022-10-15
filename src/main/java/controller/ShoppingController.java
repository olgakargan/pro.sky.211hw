package controller;

import service.ShoppingService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/order")
@Scope("session")
public class ShoppingController {
    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping("/add")
    public void addUItem(@RequestParam(value = "ids") Set<Integer> itemIds) {
        shoppingService.add(itemIds);
    }

    @GetMapping("/get")
    public Object getAllProduct() {
        return shoppingService.get();
    }
}