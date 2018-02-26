// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String reverseString(String str){
    
    if(str == null || str.length() < 2 ) return str;
    
    String inStr = str;
    StringBuilder result = new StringBuilder();
    
    for(int i = inStr.length() - 1; i >= 0; i--){
        result.append(inStr.charAt(i));
    }
    
    return result.toString();
}