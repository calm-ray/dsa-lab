import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementII229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(bruteForce(arr).toString());
        // System.out.println(optimizedWithSpace(arr).toString());
        System.out.println(mooresAlgo(arr).toString());
    }

    private static List<Integer> optimizedWithSpace(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(ans.contains(arr[i]))
                continue;
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i]) > n/3)
                ans.add(arr[i]);
        }

        return ans;
    }

    private static List<Integer> bruteForce(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n && ans.size() < 3; i++) {
            if(ans.contains(arr[i])) {
                continue;
            }

            int count = 0;
            for(int j=0; j<n; j++) {
                if(arr[i] == arr[j]) count++;
            }

            if(count > n/3) ans.add(arr[i]);
        }

        return ans;
    }

    private static List<Integer> mooresAlgo(int[] arr) {
        int ele1 = 0, ele2 = 0, c1 = 0, c2 = 0, n=arr.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(c1 == 0 && arr[i] != ele2) {
                c1 = 1;
                ele1 = arr[i];
            } else if(c2 == 0 && arr[i] != ele1) {
                c2 = 1;
                ele2 = arr[i];
            } else if(arr[i] == ele1) {
                c1++;
            } else if(arr[i] == ele2) {
                c2++;
            } else {
                c1--; c2--;
            }
        }

        int threshold = n / 3;
        c1 = 0; c2 = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == ele1) c1++;
            else if(arr[i] == ele2) c2++;
        }

        if(c1 > threshold)
            ans.add(ele1);
        if(c2 > threshold)
            ans.add(ele2); 
        return ans;
    }
}
