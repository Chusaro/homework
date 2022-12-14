import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.onepoint.kata.BuyTwoGetOneFreePackagePricing;
import fr.onepoint.kata.DefaultPackagePricing;
import fr.onepoint.kata.Item;
import fr.onepoint.kata.OneNinetyNineAPoundPackagePrincing;
import fr.onepoint.kata.PackagePricing;
import fr.onepoint.kata.ThreeForADollarPackagePricing;

public class PackagePriceTest {
	private static Item item;

	@BeforeAll
	static void init() {
		item = new Item(0, 1.99f, 1f);
	}

	@Test
	void should_calculate_price() {
		item.setQuantity(1);
		item.setWeight(0);
		PackagePricing packagePricing = new DefaultPackagePricing(item);
		float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(1.99F);
	}

	@Test
	void should_apply_discount_three_for_a_dollar() {
		item.setWeight(0);
		item.setQuantity(3);
		PackagePricing packagePricing = new ThreeForADollarPackagePricing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(1f);

	}

	@Test
	void should_apply_discount_three_for_a_dollar_for_two_units() {
		item.setQuantity(2);
		item.setWeight(0);
		PackagePricing packagePricing = new ThreeForADollarPackagePricing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(3.98f);

	}

	@Test
	void should_apply_discount_three_for_a_dollar_for_4_units() {
		item.setQuantity(4);
		item.setWeight(0);
		PackagePricing packagePricing = new ThreeForADollarPackagePricing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(2.99f);

	}

	@Test
	void should_apply_discount_buy_two_get_one_free() {
		item.setQuantity(2);
		item.setWeight(0);
		final PackagePricing packagePricing = new BuyTwoGetOneFreePackagePricing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(1.99f);

	}

	@Test
	void should_apply_discount_buy_two_get_one_free_for_one_unit() {
		item.setQuantity(1);
		item.setWeight(0);
		final PackagePricing packagePricing = new BuyTwoGetOneFreePackagePricing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(1.99f);

	}

	@Test
	void should_apply_discount_buy_two_get_one_free_for_five_unit() {
		item.setQuantity(5);
		item.setWeight(0);
		final PackagePricing packagePricing = new BuyTwoGetOneFreePackagePricing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(5.97f);

	}

	@Test
	void should_apply_discount_oneninety_nine_a_pound() {
		item.setQuantity(0);
		item.setWeight(1);
		PackagePricing packagePricing = new OneNinetyNineAPoundPackagePrincing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(1.99f);

	}

	@Test
	void should_apply_discount_oneninety_nine_a_pound_for_two_pounds() {
		item.setQuantity(0);
		item.setWeight(2);
		PackagePricing packagePricing = new OneNinetyNineAPoundPackagePrincing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(3.98f);

	}

	@Test
	void should_apply_discount_oneninety_nine_a_pound_for_four_ounces() {
		item.setQuantity(0);
		item.setWeight(0.25f);
		PackagePricing packagePricing = new OneNinetyNineAPoundPackagePrincing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(0.5f);

	}

	@Test
	void should_apply_discount_oneninety_nine_a_pound_for_two_dot_six_pounds() {
		item.setQuantity(0);
		item.setWeight(2.6f);
		PackagePricing packagePricing = new OneNinetyNineAPoundPackagePrincing(item);
		final float result = packagePricing.calculate();
		Assertions.assertThat(result).isEqualTo(5.17f);

	}


}
