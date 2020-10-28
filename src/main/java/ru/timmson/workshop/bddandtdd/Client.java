package ru.timmson.workshop.bddandtdd;

class Client {

    protected Client() {

    }

    public static Client forType(String clientType) {
        return clientType.equals("VIP") ?
                new VipClient(2500, 0.95) :
                new CommonClient(1000);
    }

    public int calc(int cartAmount, int deliveryAmount) {
        return cartAmount + deliveryAmount;
    }

}
