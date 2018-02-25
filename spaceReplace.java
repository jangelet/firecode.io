// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String replace(String a, String b) {
    
    if(b == " " || b == "" || a == "") return a;
    
    //StringBuilder is more efficient than String (String is immutable, keeps having to make new String object -- SB allows appending
    
    StringBuilder result = new StringBuilder();
    
    for(int i = 0; i < a.length(); i++){
        if(a.charAt(i) == ' '){
            result.append(b);
        }else{
            result.append(a.charAt(i));
        }
    }
    
    return result.toString();
}