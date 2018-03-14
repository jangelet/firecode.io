public static int[] merge(int[] arrLeft, int[] arrRight){
	int resultLength = arrLeft.length + arrRight.length;
	int[] result = new int [resultLength];

	int[] max = (arrLeft.length == Math.max(arrLeft.length, arrRight.length)) ? arrLeft : arrRight;
	int[] min = (arrLeft.length == Math.min(arrLeft.length, arrRight.length)) ? arrLeft : arrRight;

	if(arrLeft.length == arrRight.length){
		max = arrLeft;
		min = arrRight;
	}

	for(int i = 0; i < max.length; i++){
		result[i] = max[i];
	}

	for(int i = max.length; i < resultLength; i++){
		result[i] = min[i - max.length];
	}

	Arrays.sort(result);

	return result;
}
