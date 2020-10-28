package ru.timmson.workshop.bddandtdd;

class VipClient extends Client {

    private final int discountBorder;
    private final double discountRate;

    public VipClient(int discountBorder, double discountRate) {
        this.discountBorder = discountBorder;
        this.discountRate = discountRate;
    }

    @Override
    public int calc(int cartAmount, int deliveryAmount) {
        return super.calc(cartAmount >= discountBorder ? Double.valueOf(cartAmount * discountRate).intValue() : cartAmount, 0);
    }
}
