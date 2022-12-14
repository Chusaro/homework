package fr.onepoint.kata;

public class OneNinetyNineAPoundPackagePrincing extends DefaultPackagePricing {
	public OneNinetyNineAPoundPackagePrincing(final Item itemp) {
		super(itemp);
	}


	@Override
	public float calculate() {
		return (float) (Math.round(item.getUnitPrice() * item.getWeight() * 100.0) / 100.0);
	}
}
