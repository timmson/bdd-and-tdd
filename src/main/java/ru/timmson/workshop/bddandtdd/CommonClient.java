package ru.timmson.workshop.bddandtdd;

class CommonClient extends Client {

    private final int freeDeliveryBorder;

    public CommonClient(int freeDeliveryBorder) {
        this.freeDeliveryBorder = freeDeliveryBorder;
    }

    @Override
    public int calc(int cartAmount, int deliveryAmount) {
        return super.calc(cartAmount, cartAmount >= freeDeliveryBorder ? 0 : deliveryAmount);
    }
}
