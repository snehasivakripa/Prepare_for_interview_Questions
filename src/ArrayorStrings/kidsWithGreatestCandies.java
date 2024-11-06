package ArrayorStrings;

import java.util.ArrayList;
import java.util.List;


public class kidsWithGreatestCandies {

    private List<Boolean> greatestCandies(int[] candies, int extraCandies) {

        List<Boolean> output =new ArrayList<>();
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            int candy=candies[i];
            largest= Math.max(largest,candy);
            output.add((candy+extraCandies)>=largest);
        }
        return output;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extraCandies=3;
        kidsWithGreatestCandies kids=new kidsWithGreatestCandies();
        List<Boolean> output=kids.greatestCandies(arr,extraCandies);
        System.out.println(output);
    }
}
