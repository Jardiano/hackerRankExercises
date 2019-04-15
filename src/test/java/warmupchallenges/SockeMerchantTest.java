package warmupchallenges;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class SockeMerchantTest {
    SockeMerchant sm;

    @Before
    public void setUp() {
        sm = new SockeMerchant();
    }

    @Test
    public void testCountPairs() {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        assertThat(3, equalTo(sm.sockMerchant(n, ar)));
    }

}
