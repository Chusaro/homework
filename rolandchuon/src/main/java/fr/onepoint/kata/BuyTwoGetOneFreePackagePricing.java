package fr.onepoint.kata;

public class BuyTwoGetOneFreePackagePricing extends DefaultPackagePricing {

	public static final int TWO = 2;

	public BuyTwoGetOneFreePackagePricing(final Item itemp) {
		super(itemp);
	}

	@Override
	public float calculate() {
		int lotsOfTwo = item.getQuantity() / TWO;
		int lotLeft = item.getQuantity() % TWO;
		if (item.getQuantity() > TWO) {
			return (float) (Math.round((buyTwoGetOneFree() * lotsOfTwo + item.getUnitPrice() * lotLeft) * 100.0) / 100.0);
		}
		return buyTwoGetOneFree();
	}
}
