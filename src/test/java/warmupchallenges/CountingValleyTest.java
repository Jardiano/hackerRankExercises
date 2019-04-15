package warmupchallenges;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CountingValleyTest {
    CountingValley cv;

    @Before
    public void setUp() {
        cv = new CountingValley();
    }

    @Test
    public void testCountingValleys() {
        int numberElements = 8;

        String path = "UDDDUDUU";

        assertThat(1, equalTo(cv.countingValleys(numberElements, path)));
    }

    @Test
    public void testCountingValleysWithBigText() throws IOException {
        int numberElements = 1000000;

        File  file = new File("src/test/resources/CountingValley.txt");
        String filePath = file.getAbsolutePath();

        String  path = new String(Files.readAllBytes(Paths.get(filePath)));

        assertThat(30, equalTo(cv.countingValleys(numberElements, path)));
    }
}
