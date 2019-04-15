package warmupchallenges;

/**
 * This challenge is abount count the number of valleys using this rule:
 * <p>
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up
 * from sea level and ending with a step down to sea level.
 * <p>
 * A valley is a sequence of consecutive steps below sea level, starting with a step down
 * from sea level and ending with a step up to sea level.
 * <p>
 * The step up = D and step down = D.
 * <p>
 * Ex:
 * <p>
 * path = "UDDDUDUU"
 * <p>
 * Number of valleys = 1, because the sequence DDU, represents one valley.
 */
public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        String[] walk = s.split("");

        int countValley = 0;
        int level = 0;

        for (int i = 0; i < n; i++) {

            String current = walk[i];

            if ("D".equalsIgnoreCase(current)) {
                level--;
            } else {
                level++;
            }

            if ("U".equalsIgnoreCase(current) && level == 0) {
                countValley++;
            }

        }

        return countValley;
    }


    public static void main(String[] args) {
        int n = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(n, path));
    }
}
