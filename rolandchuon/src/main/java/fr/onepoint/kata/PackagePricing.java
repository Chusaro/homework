package fr.onepoint.kata;

public abstract class PackagePricing {
	protected Item item;

	float buyThreeForADollar() {
		return 1f;
	}

	float buyTwoGetOneFree() {
		return (float) (item.getUnitPrice());
	}

	public abstract float calculate();


}
