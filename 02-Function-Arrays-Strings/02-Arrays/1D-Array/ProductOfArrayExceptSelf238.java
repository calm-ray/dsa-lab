import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf238 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(Arrays.toString(bruteforce(arr)));
        // System.out.println(Arrays.toString(divisionMethod(arr)));
        // System.out.println(Arrays.toString(optimizedWithExtraSpace(arr)));
        System.out.println(Arrays.toString(optimizedWithoutSpace(arr)));
    }

    private static int[] bruteforce(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int product = 1;
            for(int j=0; j<arr.length; j++) {
                if(i != j) {
                    product *= arr[j];
                }
            }
            ans[i] = product;
        }

        return ans;
    }   

    private static int[] divisionMethod(int[] nums) {
        int product = 1;
        int countZeros = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) countZeros++;
            product *= nums[i];
        }

        int[] ans = new int[nums.length];

        if(countZeros > 1) {
            return ans;
        }

        int zeroIndex = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0)
                ans[i] = product / nums[i];
            else
                zeroIndex = i;
        }

        if(zeroIndex != -1) {
            int temp = 1;
            for(int i=0; i<nums.length; i++) {
                if(i != zeroIndex)
                    temp *= nums[i];
            }
            ans[zeroIndex] = temp;
        }

        return ans;
    }

    private static int[] optimizedWithExtraSpace(int[] nums) {
        int[] prefix = prefixMul(nums);
        int[] suffix = suffixMul(nums);
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }

    private static int[] prefixMul(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = 1;

        for(int i=1; i<arr.length; i++) {
            ans[i] = arr[i-1] * ans[i-1];
        }

        return ans;
    }

    private static int[] suffixMul(int[] arr) {
        int[] ans = new int[arr.length];
        ans[arr.length-1] = 1;

        for(int i=arr.length-2; i>=0; i--) {
            ans[i] = arr[i+1] * ans[i+1];
        }

        return ans;
    }

    private static int[] optimizedWithoutSpace(int[] nums) {
        int n = nums.length, mult = 1;
        int[] ans = new int[n];

        for(int i=0; i<n; i++) {
            ans[i] = mult;
            mult *= nums[i];
        }

        mult = 1;
        for(int i=n-1; i>=0; i--) {
            ans[i] *= mult;
            mult *= nums[i];
        }

        return ans;
    }
}
