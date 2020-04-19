class Test {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Cola", "light, 0.5L", 4.0, "napoje");
        products[1] = new Product("Chleb", "razowy z dodatkiem słonecznika", 8.0, "jedzenie");
        products[2] = new Product("Orbit", "guma do żucia", 5.0, "inne");

        PriceService priceService = new PriceService();

        for (Product product : products) {
            System.out.println(product.toString() + ". Cena brutto: " + priceService.calculateGrossPrice(product));
        }
    }
}
