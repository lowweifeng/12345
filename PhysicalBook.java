class PhysicalBook extends Book {
    private double weight;

    public PhysicalBook(String title, String author, double price, int quantity, int weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }

    // Getter and Setter methods
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateShippingCost() {
        double shippingCost = 4.50;
        double additionalWeight = weight - 500;

        if (additionalWeight > 0) {
            Double additionalCharge = Math.ceil(additionalWeight / 250);
            shippingCost += additionalCharge;
        }
        

        return shippingCost;
    }

    public double getWeightInPounds() {
        return weight * 0.00220462;
    }
}