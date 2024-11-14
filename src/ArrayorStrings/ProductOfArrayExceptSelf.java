package ArrayorStrings;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        Arrays.fill(result,1);
        int point=1;
        for(int i=0;i<n;i++){
            result[i]*=point;
            point*=nums[i];
        }
        point=1;
        for(int i=n-1;i>=0;i--){
            result[i]*=point;
            point*=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num={1,2,3,4};
        ProductOfArrayExceptSelf product=new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(product.productExceptSelf(num)));
    }
}
