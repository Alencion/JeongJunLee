package gcd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {

    @Test
    void GCD(){
        Assertions.assertEquals(1, gcd(10, 3));
        Assertions.assertEquals(2, gcd(10, 2));
        Assertions.assertEquals(5, gcd(15, 10));
    }

    static int gcd(int p, int q){
        if(p % q == 0) {
            return q;
        }

        return gcd(q, p % q);
    }
}
