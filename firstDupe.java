// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Character firstNonRepeatedCharacter(String str) {
    
    LinkedHashMap<Character, Integer> tracker = new LinkedHashMap();
    
    for(int i = 0; i < str.length(); i++){
        if(tracker.get(str.charAt(i)) == null){
            tracker.put(str.charAt(i), 0);
        }else{
            tracker.put(str.charAt(i), tracker.get(str.charAt(i)) + 1);
        }
    }
    
    for(Map.Entry<Character, Integer> entry : tracker.entrySet()){
        if(entry.getValue() == 0) return entry.getKey();
    }
    
    return null;
}