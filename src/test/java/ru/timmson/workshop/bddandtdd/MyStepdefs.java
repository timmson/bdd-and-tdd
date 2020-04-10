package ru.timmson.workshop.bddandtdd;

import io.cucumber.java8.En;

public class MyStepdefs implements En {

    public MyStepdefs() {
        Given("{string} и {int}", (String clientType, Integer cartSum) -> {
        });

        When("Проводим расчет", () -> {
        });

        Then("Получаем {int}", (Integer orderSum) -> {

        });

    }
}
