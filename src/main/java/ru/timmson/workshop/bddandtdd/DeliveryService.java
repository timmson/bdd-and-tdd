package ru.timmson.workshop.bddandtdd;

import org.springframework.stereotype.Service;
import ru.timmson.workshop.bddandtdd.client.Client;

@Service
public class DeliveryService {

    private final int DELIVERY_AMOUNT = 250;

    public Integer calculate(String clientType, String cartAmount) {
        return Client.forType(clientType).calc(Integer.parseInt(cartAmount), DELIVERY_AMOUNT);
    }
}
