class PriceService {
    private final double foodTax = 0.15;
    private final double drinkTax = 0.1;

    public double calculateGrossPrice(Product product) {
        double grossPrice;
        switch (product.getCategory()) {
            case "jedzenie":
                grossPrice = product.getNetPrice() + product.getNetPrice() * foodTax;
                break;
            case "napoje":
                grossPrice = product.getNetPrice() + product.getNetPrice() * drinkTax;
                break;
            default:
                System.err.println("Nieznana kategoria, nie można obliczyć kwoty brutto.");
                return product.getNetPrice();
        }
        return grossPrice;
    }
}
