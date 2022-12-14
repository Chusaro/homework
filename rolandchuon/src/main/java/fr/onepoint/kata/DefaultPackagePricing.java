package fr.onepoint.kata;

import fr.onepoint.kata.Item;
import fr.onepoint.kata.PackagePricing;

public class DefaultPackagePricing extends PackagePricing {
	public DefaultPackagePricing(Item itemp) {
		item = itemp;
	}

	@Override
	public float calculate() {
		return (float) ((item.getQuantity() == 0 ? item.getWeight() : item.getQuantity()) * item.getUnitPrice());
	}
}
