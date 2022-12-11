package fr.onepoint.kata;

public interface PackagePricing {
    default float calculate() {
        return calculate(1.1F, 1);
    }

    static float calculate(float price, int quantity) {
        return (float) (price * quantity);
    }
}
