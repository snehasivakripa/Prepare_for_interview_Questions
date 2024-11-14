package ArrayorStrings;

public class IncreasingTripletSequence {

    public boolean increasingTriplet(int[] nums) {

        for(int i=0;i<nums.length-2;i++){
            if(nums[i]<nums[i+1]&& nums[i+1]<nums[i+2]){
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num={2,2,2,2};
        IncreasingTripletSequence increase=new IncreasingTripletSequence();
        System.out.println(increase.increasingTriplet(num));
    }
}
