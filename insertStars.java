public static String insertPairStar(String s){
	//base case
	if(s == null) return null;
	if(s.length() < 2) return s;

	if(s.charAt(0) == s.charAt(1)) return s.substring(0,1) + "*" + insertPairStar(s.substring(1));

	return s.substring(0,1) + insertPairStar(s.substring(1));
}
