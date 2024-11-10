package ArrayorStrings;
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int count=0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0){
                boolean leftSide= (i==0||flowerbed[i-1]==0);
                boolean rightSide=(i==flowerbed.length-1||flowerbed[i+1]==0);
                if(leftSide && rightSide){
                    flowerbed[i]=1;
                    count++;
                }
                if(count>=n){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n=3;
        CanPlaceFlowers placeFlowers=new CanPlaceFlowers();
        System.out.println(placeFlowers.canPlaceFlowers(flowerbed,n));
    }
}
