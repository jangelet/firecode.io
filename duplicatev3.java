public static String duplicate(int[] numbers){
    
    int[] arr = numbers;
    Arrays.sort(arr);
    TreeSet<Integer> result = new TreeSet();
    for(int i = 0; i < arr.length - 1; i++){
        if(arr[i] == arr[i + 1]) result.add(arr[i]);
    }
    
    return result.toString();
    
}