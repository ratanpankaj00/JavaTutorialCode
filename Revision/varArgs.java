package Revision;

class MeanCalculator{
    public static float mean(float... nums){
       float x = 0;
       for(byte i=0;i<nums.length;i++){
        x = x + nums[i];
       }
       return x/(float)nums.length;
    }
}
public class varArgs {
    public static void main(String[] args) {
        System.out.println(MeanCalculator.mean(77,33,23,24,89));
    }
}
