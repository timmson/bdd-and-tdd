package ru.timmson.workshop.bddandtdd;

import io.cucumber.java8.En;

import static org.junit.Assert.assertEquals;

public class MyStepdefs implements En {

    String clientType;
    Integer deliveryAmount;
    Integer cartAmount;

    Integer orderAmount = 0;

    public MyStepdefs() {

        Given("{string} и {int}", (String clientType, Integer cartAmount) -> {
            this.clientType = clientType;
            this.cartAmount = cartAmount;
        });

        And("Стоимость доствки {int}", (Integer deliveryAmount) -> {
            this.deliveryAmount = deliveryAmount;
        });

        When("Проводим расчет", () -> {
            this.orderAmount  = Client.forType(clientType).calc(cartAmount, deliveryAmount);
        });

        Then("Получаем {int}", (Integer orderAmount) -> {
            assertEquals(orderAmount, this.orderAmount);
        });


    }
}
