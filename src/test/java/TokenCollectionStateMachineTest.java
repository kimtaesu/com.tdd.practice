import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class TokenCollectionStateMachineTest {

    private PrimeFactor primeFactor;

    @Test
    public void wordCount() {
        assertFactors(1, Arrays.asList());
        assertFactors(2, Arrays.asList(2));
        assertFactors(3, Arrays.asList(3));
        assertFactors(4, Arrays.asList(2, 2));
        assertFactors(5, Arrays.asList(5));
        assertFactors(6, Arrays.asList(2, 3));
        assertFactors(7, Arrays.asList(7));
        assertFactors(8, Arrays.asList(2, 2, 2));
        assertFactors(9, Arrays.asList(3, 3));
        assertFactors(17, Arrays.asList(17));
    }

    private void assertFactors(int n, List<Integer> value) {
        primeFactor = new PrimeFactor();
        assertThat(primeFactor.factors(n), is(value));
    }


}
