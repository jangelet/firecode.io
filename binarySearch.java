// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Boolean binarySearch(int[] arr, int n){
    
    int left = 0;
    int right = arr.length - 1;
    
    
    while(left <= right){
        int mid = (left + right)/2;
        if(arr[mid] == n){
            return true;
        }else if(arr[mid] < n){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    return false;
}