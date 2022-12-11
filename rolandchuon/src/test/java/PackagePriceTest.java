import fr.onepoint.kata.PackagePricing;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackagePriceTest {


    @Test
    void should_calculate_price() {
        float result = PackagePricing.calculate(1.99F, 1);
        Assertions.assertThat(result).isEqualTo(1.99F);
    }

    
}
