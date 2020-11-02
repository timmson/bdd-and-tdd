# bdd-and-tdd
ATDD and TDD example


![A-TDD](https://dzone.com/storage/temp/7012527-atdd-workflow.jpg)

[Read More](https://dzone.com/articles/acceptance-test-driven-development-closing-the-com)


## Work with legacy code

---
_**Legend**: You have legacy (without tests) service which calculates order amount. You've hired separate testing team. 
They worked hard some months and wrote acceptance tests._

---

### Observe
1. Go to ```legacy-code``` branch.
1. Observe ```src/main/java/ru/timmson/workshop/bddandtdd/DeliveryContoller``` and ```src/test/resources/deliver.feature```.
1. Run ```src/main/java/ru/timmson/workshop/bddandtdd/Application```.
1. Open in a browser [http://localhost:8080](http://localhost:8080).
1. Run ```src/test/resources/deliver.feature```.

### Refactor
1. Add TDD ```DeliveryServiceShould``` and create ```DeliverService```.
```java
    @Test
    void addDeliveryFeeToOrderAmount() {
        assertEquals(1249, deliveryService.calculate(999));
    }

    @Test
    void NotAddDeliveryFeeToOrderAmountIfItIsEqualOrMoreThen1000() {
        assertEquals(1000, deliveryService.calculate(1000));
    }
```
1. Replace call in ```DeliveryContoller```
1. Extract interface of ```DeliverService```
