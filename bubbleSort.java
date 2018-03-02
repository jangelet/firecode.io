public static int[] bubbleSortArray(int[] arr){
    
    int temp = 0;
    //iterate through array, comparing each value to the next 
    for(int bubble = arr.length - 1; bubble >= 0; bubble--){
        for(int i = 0; i < bubble; i++){
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    
    return arr;
}
