public static int[] merge(int[] arrLeft, int[] arrRight){
	int resultLength = arrLeft.length + arrRight.length;
	int[] result = new int [resultLength];

	int leftIndex = 0;
	int rightIndex = 0;
	int resultIndex = 0;

	while(leftIndex < arr.length && rightIndex < arrRight.length){
		if(arrLeft[leftIndex] < arrRight[rightIndex]){
			result[resultIndex] = arrLeft[leftIndex];
			resultIndex++;
			leftIndex++;
		}else{
			result[resultIndex] = arrRight[rightIndex];
			resultIndex++;
			rightIndex++;
		}
	}

	while(leftIndex < arrLeft.length){
		result[resultIndex] = arrLeft[leftIndex];
		resultIndex++;
		leftIndex++;
	}

	while(rightIndex < arrRight.length){
		result[resultIndex] = arrRight[rightIndex];
		resultIndex++;
		rightIndex++;
	}

	return result;

}
