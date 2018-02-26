// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String duplicate(int[] numbers){
    LinkedList result = new LinkedList();
    Arrays.sort(numbers);
    for(int i = 0; i < numbers.length - 1; i++){
        if(numbers[i] == numbers[i+1]) result.add(numbers[i]);
    }
    
    return result.toString();
}