import java.util.ArrayList;
import java.util.List;

class PrimeFactor {

    public List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int divisor = 2; n > 1; divisor++)
            for (; n % divisor == 0; n /= divisor)
                factors.add(divisor);

        if (n > 1)
            factors.add(n);

        return factors;
    }

}
