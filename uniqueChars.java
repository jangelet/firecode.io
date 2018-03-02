// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean areAllCharactersUnique(String str){
    
    if(str == null || str == "") return true;
    
    HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
    
    for(int i = 0; i < str.length(); i++){
        if(counter.get(str.charAt(i)) != null){
            return false;
        }else{
            counter.put(str.charAt(i), 1);
        }
    }
    
    return true; 

}