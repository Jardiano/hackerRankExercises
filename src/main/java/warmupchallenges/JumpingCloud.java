package warmupchallenges;

/**
 * This challenge is about a game in which you can jump between clouds in a sequence of steps, defined through
 * a vector. Jumping between the positions of this vector you need to avoid the clouds with the value 1 in your position.
 * <p>
 * Another rule is, you can jump to clouds withe the number equal of the current cloud plus 1 or 2.
 * <p>
 * Ex:
 * Using a vector with 7 positions.
 * 0 0 1 0 0 1 0
 * <p>
 * The path need to be: 0-1-3-4-6
 * <p>
 * You will use 4 jumps in this example.
 * <p>
 * Another Example:
 * Using a vector with 6 positions.
 * <p>
 * 0 0 0 0 1 0
 * <p>
 * The path need to be:0-2-3-5
 * <p>
 * You will use 3 jumps in this example.
 */
public class JumpingCloud {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jump = 0;

        String path = "";

        int vectorLength = c.length - 1;

        for (int i = 0; i < c.length; i++) {

            if (c[i] == 0 && (isLessThanVectorLength(i, 1, vectorLength) ||
                    isLessThanVectorLength(i, 2, vectorLength))) {
                path = updatePath(path, i);
                jump++;

                if (isLessThanVectorLength(i, 2, vectorLength) && c[i + 2] == 0) {
                    i = i + 2;
                    path = updatePath(path, i);
                    jump++;
                } else if (isLessThanVectorLength(i, 1, vectorLength) && c[i + 1] == 0) {
                    i = i + 1;
                    path = updatePath(path, i);
                    jump++;

                }
            }

        }

        System.out.println("Path " + path);

        return jump;
    }

    public static boolean isLessThanVectorLength(int counter, int nextPosition, int vectorLength) {
        return counter + nextPosition < vectorLength;
    }

    private static String updatePath(String path, int i) {
        path += i + ", ";
        return path;
    }

}