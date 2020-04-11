package ru.timmson.workshop.bddandtdd;

import io.cucumber.java8.En;

import static org.junit.Assert.assertEquals;

public class MyStepdefs implements En {

    String clientType;
    Integer cartSum;
    Integer orderSum = 0;

    public MyStepdefs() {

        Given("{string} и {int}", (String clientType, Integer cartSum) -> {
            this.clientType = clientType;
            this.cartSum = cartSum;
        });

        When("Проводим расчет", () -> {
            //
        });

        Then("Получаем {int}", (Integer orderSum) -> {
            assertEquals(orderSum, this.orderSum);
        });

    }
}
