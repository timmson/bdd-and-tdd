package ru.timmson.workshop.bddandtdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    private DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/delivery/{clientType}/{cartAmount}/")
    public Integer calculate(@PathVariable("clientType") String clientType,
                          @PathVariable("cartAmount") String cartAmount) {
        return deliveryService.calculate(clientType, cartAmount);
    }
}
