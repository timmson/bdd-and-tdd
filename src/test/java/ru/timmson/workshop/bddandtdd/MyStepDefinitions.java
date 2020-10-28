package ru.timmson.workshop.bddandtdd;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepDefinitions {

    String clientType;
    Integer deliveryAmount;
    Integer cartAmount;
    Integer orderAmount = 0;

    @Дано("{string} и {int}")
    public void given(String clientType, Integer cartAmount) {
        this.clientType = clientType;
        this.cartAmount = cartAmount;
    }

    @И("Стоимость доствки {int}")
    public void and(Integer deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    @Когда("Проводим расчет")
    public void when() {
        this.orderAmount = Client.forType(clientType).calc(cartAmount, deliveryAmount);
    }

    @Тогда("Получаем {int}")
    public void then(Integer orderAmount) {
        assertEquals(orderAmount, this.orderAmount);
    }

}
