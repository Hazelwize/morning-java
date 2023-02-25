// You get an array of numbers, return the sum of all of the positives ones.

// Example [1,-4,7,12] => 1 + 7 + 12 = 20

// Note: if there is nothing to sum, the sum is default to 0.


public class solution9 {
    public static int sum(int[] arr){
        int result = 0;
        for(int num: arr){
          if(num > 0){
            result += num;
          }
        }
        return result;
    } 
}
