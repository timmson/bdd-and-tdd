package ru.timmson.workshop.bddandtdd;

class DeliveryService {
    public int calculate(int orderAmount) {
        return orderAmount + (orderAmount >= 1000 ? 0 : 250);
    }
}
