public static boolean permutation(String str1, String str2) {
	    if(str1.length() != str2.length()) return false;
	    char[] str1Arr = str1.toCharArray();
	    char[] str2Arr = str2.toCharArray();
		        
	    Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);
			        
	    for(int i = 0; i < str1Arr.length; i++){
		    if(str1Arr[i] != str2Arr[i]) return false;
	    }
	    return true;
}





