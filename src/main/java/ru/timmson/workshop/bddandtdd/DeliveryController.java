package ru.timmson.workshop.bddandtdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @GetMapping("/delivery/{clientType}/{cartAmount}/")
    public Integer calculate(@PathVariable("clientType") String clientType,
                             @PathVariable("cartAmount") Integer cartAmount) {

        if (clientType.equals("VIP")) {
            if (cartAmount >= 2500) {
                return Double.valueOf(cartAmount * 0.95).intValue();
            } else {
                return cartAmount;
            }
        } else if (clientType.equals("Обычный")) {
            if (cartAmount > 1000) {
                return cartAmount;
            } else {
                return cartAmount + 250;
            }
        } else {

        }

        return 0;
    }
}
