package warmupchallenges;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JumpingCloudTest {

    JumpingCloud jp;

    @Before
    public void setUp() throws Exception {
        jp = new JumpingCloud();
    }

    @Test
    public void jumpingOnClouds() {
        int[] vetor = {0,0,1,0,0,1,0};
        assertThat(4 , is(equalTo(jp.jumpingOnClouds(vetor))));
    }

    @Test
    public void jumpingOnCloudsWithOutJumpOne() {
        int[] vetor = {0,0,0,0,1,0};
        assertThat(3 , is(equalTo(jp.jumpingOnClouds(vetor))));
    }

    @Test
    public void jumpingOnCloudsWithBigSequence(){
        int[] vetor = {0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,1,0,
                1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,
                0,1,0,1,0,0,0,0,1,0};


        assertThat(54 , is(equalTo(jp.jumpingOnClouds(vetor))));

    }
}