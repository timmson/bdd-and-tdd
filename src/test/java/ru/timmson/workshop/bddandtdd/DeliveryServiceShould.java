package ru.timmson.workshop.bddandtdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeliveryServiceShould {

    @Test
    public void addDeliveryAmountToCardAmount_whenClientIsNotVip() {
        int cartAmount = 1;
        int deliveryAmount = 1;
        String clientType = "Common";

        int result = Client.forType(clientType).calc(cartAmount, deliveryAmount);

        assertEquals(result, 2);
    }

    @Test
    public void notAddDeliveryAmountToCardAmount_whenCartAmountIsMoreThen1k() {
        int cartAmount = 1000;
        int deliveryAmount = 1;
        String clientType = "Common";

        int result = Client.forType(clientType).calc(cartAmount, deliveryAmount);

        assertEquals(result, 1000);
    }

    @Test
    public void notAddDeliveryAmountToCardAmount_whenClientIsVip() {
        int cartAmount = 1;
        int deliveryAmount = 1;
        String clientType = "VIP";

        int result = Client.forType(clientType).calc(cartAmount, deliveryAmount);

        assertEquals(result, 1);
    }

    @Test
    public void applyDiscount_whenClientIsVipAndCartAmountIsMoreThen1k() {
        int cartAmount = 2500;
        int deliveryAmount = 1;
        String clientType = "VIP";

        int result = Client.forType(clientType).calc(cartAmount, deliveryAmount);

        assertEquals(result, 2375);
    }

}
