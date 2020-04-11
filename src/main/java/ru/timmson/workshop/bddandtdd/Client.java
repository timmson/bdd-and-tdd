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

    private static class VipClient extends Client {

        private final int discountBorder;
        private final double discountRate;

        public VipClient(int discountBorder, double discountRate) {
            this.discountBorder = discountBorder;
            this.discountRate = discountRate;
        }

        @Override
        public int calc(int cartAmount, int deliveryAmount) {
            return super.calc(cartAmount >= discountBorder ? new Double(cartAmount * discountRate).intValue() : cartAmount, 0);
        }
    }

    private static class CommonClient extends Client {

        private final int freeDeliveryBorder;

        public CommonClient(int freeDeliveryBorder) {
            this.freeDeliveryBorder = freeDeliveryBorder;
        }

        @Override
        public int calc(int cartAmount, int deliveryAmount) {
            return super.calc(cartAmount, cartAmount >= freeDeliveryBorder ? 0 : deliveryAmount);
        }
    }
}
