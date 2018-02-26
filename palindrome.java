// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isStringPalindrome(String str){
    
    if(str == null || str.length() < 2) return true;
    
    // StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < str.length()/2 ; i++){
        // sb.append(str.charAt(i));
        if(str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
    }
  
    // return str.equals(sb.toString());
    return true;
}