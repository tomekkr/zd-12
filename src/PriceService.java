class PriceService {
    private final static double FOOD_TAX = 0.15;
    private final static double DRINK_TAX = 0.1;

    public double calculateGrossPrice(Product product) {
        double grossPrice;
        switch (product.getCategory()) {
            case "jedzenie":
                grossPrice = product.getNetPrice() + product.getNetPrice() * FOOD_TAX;
                break;
            case "napoje":
                grossPrice = product.getNetPrice() + product.getNetPrice() * DRINK_TAX;
                break;
            default:
                System.err.println("Nieznana kategoria, nie można obliczyć kwoty brutto.");
                return product.getNetPrice();
        }
        return grossPrice;
    }
}
