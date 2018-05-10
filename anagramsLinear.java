public static boolean isAnagram(String input1, String input2) {
    
	//checks for auto false
    if(input1 == null || input2 == null || input1.length() != input2.length()) return false;
    
    int[] buffer = new int[26];
    
    for(int i = 0; i < input1.length(); i++){
        System.out.println(input1.charAt(i) - 'a');
        System.out.println(input2.charAt(i) - 'a');
        buffer[input1.charAt(i) - 'a']++;
        buffer[input2.charAt(i) - 'a']--;
    }
    
    for(int i = 0; i < buffer.length; i++){
        if(buffer[i] != 0) return false;
    }
    
    return true;
    
