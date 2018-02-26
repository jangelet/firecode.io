// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int findMissingNumber(int[] arr) {
    
    int sum = 0;
    // Arrays.sort(arr); adds time complexity, not necessary
    //summation of n = 10 is 55. Add up elements of array and subtract from 55 to find missing integer
    
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return (55 - sum);    
}