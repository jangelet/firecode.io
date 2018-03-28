public static int[] coupleSum(int[] numbers, int target) {
    
    if(numbers == null) return null;
    
    int[] result = new int[2];
    HashMap<Integer,Integer> tracker = new HashMap<>();
    int key = 0;
    int val = 0;
    
    for(int i = 0; i < numbers.length; i++){
        if((key + (target - numbers[i])) == target){
            result[0] = tracker.get(key);
            result[1] = tracker.get(key) + 1;
            break;
        }
        key = target - numbers[i];
        val = i + 1;
        if(tracker.get(key) == null){
            tracker.put(key, val);
        }
    }
    
    return result;
    
}