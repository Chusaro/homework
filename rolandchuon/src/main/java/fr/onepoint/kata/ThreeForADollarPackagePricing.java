package fr.onepoint.kata;

public class ThreeForADollarPackagePricing extends DefaultPackagePricing {

	public static final int THREE = 3;

	public ThreeForADollarPackagePricing(final Item itemp) {
		super(itemp);
	}


	@Override
	public float calculate() {
		int numberOfPackage = item.getQuantity() / THREE;
		int unitsLeft = item.getQuantity() % THREE;
		if (item.getQuantity() < THREE) {
			return super.calculate();
		}
		return buyThreeForADollar() * numberOfPackage + unitsLeft * item.getUnitPrice();

	}
}
