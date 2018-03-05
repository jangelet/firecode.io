// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String compressString(String text) {
    
    int counter = 1;
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < text.length() - 1; i++){
        if(text.charAt(i) == text.charAt(i+1)){
            counter++;
        }
        if(text.charAt(i) != text.charAt(i+1)){
            sb.append(text.charAt(i));
            if(counter > 1) sb.append(String.valueOf(counter));
            counter = 1;
        }
        if(i == text.length() - 2){
            if(text.charAt(i) == text.charAt(i - 1)){
                sb.append(text.charAt(i));
                if(counter > 1) sb.append(String.valueOf(counter));
            }else{
                sb.append(text.charAt(i + 1));
            }
        }
    }

    return sb.toString();
    
}