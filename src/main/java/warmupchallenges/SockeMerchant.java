package warmupchallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * This challenge is about count the number of pairs, in a specific sequence.
 *
 * Ex: {10, 20, 20, 10, 10, 30, 50, 10, 20}
 *
 * The number of pairs will be 3.
 * 10 - 4(two pairs )
 * 20 - 3(one pair)
 * 30 - 1
 * 50 - 1
 *
 */
public class SockeMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(ar[i])) {
                hashMap.replace(ar[i], hashMap.get(ar[i]) + 1);
            } else {
                hashMap.put(ar[i], 1);
            }
        }

        int countPairs = 0;

        for (Integer key : hashMap.keySet()){
            while(hashMap.get(key) >= 2){
                hashMap.replace(key,hashMap.get(key) - 2);
                countPairs++;
            }
        }

        return countPairs;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(n, ar));
    }

}
