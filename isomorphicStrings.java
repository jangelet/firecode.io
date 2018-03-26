// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isIsomorphic(String input1, String input2) {
    
    //put both strings into respective hashmaps
    //iterate through hashmap by characters?
    //if values from keys both == each othher, return true
    //if value mismatch, return false
    
    //FOR FUTURE: Don't need two loops. Can check while populating hash maps
    
    if(input1 == null || input2 == null || (input1.length() != input2.length())) return false;
    
    HashMap<Character, Integer> input1Map = new HashMap<Character, Integer>();
    HashMap<Character, Integer> input2Map = new HashMap<Character, Integer>();
    
    for(int i = 0; i < input1.length(); i++){
        char c1 = input1.charAt(i);
        char c2 = input2.charAt(i);
        if(input1Map.get(c1) == null){
            input1Map.put(c1, 1);
        }else{
            input1Map.put(c1, 1 + input1Map.get(c1));
        }
        if(input2Map.get(c2) == null){
            input2Map.put(c2, 1);
        }else{
            input2Map.put(c2, 1 + input2Map.get(c2));
        }
    }
    
    for(int i = 0; i < input1.length(); i++){
        char c1 = input1.charAt(i);
        char c2 = input2.charAt(i);
        if(input1Map.get(c1) != input2Map.get(c2)) return false;
    }
    
    return true;
    
}