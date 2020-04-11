# language: en
Feature: Calculation delivery. Для обычных клиентов стоимость доставки 250р до 100р заказа,
  больше 1000р - бесплатно. Для VIP клиенто доставка всегда бесплатная, если заказ больше 2500 р - то скида 5%

  Scenario Template: Получаем <Тип клиента> и <Сумма корзины>, вовзрващаем <Сумма заказа> с учетом доставки
    Given <Тип клиента> и <Сумма корзины>
    And Стоимость доствки 250
    When Проводим расчет
    Then Получаем <Сумма заказа>

    Examples:
      | Тип клиента | Сумма корзины | Сумма заказа |
      | "Обычный"   | 999           | 1249         |
      | "Обычный"   | 1000          | 1000         |
      | "VIP"       | 999           | 999          |
      | "VIP"       | 2499          | 2499         |
      | "VIP"       | 2500          | 2375         |
