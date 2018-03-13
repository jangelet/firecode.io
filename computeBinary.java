public static String computeBinary(int val) {
	if(val == 0) return "0";
	if(val == 1) return "1";

	return computeBinary(val/2) + String.valueOf(val%2);
}
