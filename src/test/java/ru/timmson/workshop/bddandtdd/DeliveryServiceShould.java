package ru.timmson.workshop.bddandtdd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DeliveryServiceShould {

    @Test
    void addDeliveryFeeToOrderAmount() {
        assertEquals(999 + 250, new DeliveryService().calculate(999));
    }

    @Test
    void notAddDeliveryFeeToOrderAmountIfItOverThen1000() {
        assertEquals(1000 + 0, new DeliveryService().calculate(1000));
    }

}
