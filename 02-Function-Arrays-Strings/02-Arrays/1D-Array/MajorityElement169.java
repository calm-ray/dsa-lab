import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MajorityElement169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(bruteForce(arr));
        // System.out.println(optimizedWithSpace(arr));
        System.out.println(mooreAlgo(arr));
    }

    private static int bruteForce(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=0; j<n; j++) {
                if(arr[i] == arr[j]) count++;
            }

            if(count > n/2) return arr[i];
        }

        return -1;
    }

    private static int optimizedWithSpace(int[] nums) {
        // Map<Integer, Integer> freq = new HashMap<>();
        // for(int i=0; i<nums.length; i++) {
        //     freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        // }

        Map<Integer, Long> freq = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        int max = -1;
        for (Map.Entry<Integer, Long> entry : freq.entrySet()) {
            if(entry.getValue() > Math.floor(nums.length/2)) {
                max = entry.getKey();
            }
        }

        return max;
    }

    private static int mooreAlgo(int[] arr) {
        int ele = -1;
        int count = 0;
        int n = arr.length;

        for(int i=0; i<n; i++) {
            if(count == 0) {
                count++;
                ele = arr[i];
            } else if(arr[i] == ele) {
                    count++;
            } else {
                count--;
            }
        }
        
        int tmp = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == ele)
                tmp++;
        }
        if(tmp > n/2)
            return ele;

        return -1;
    }
}
