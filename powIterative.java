public static double pow(double x, int n) {

	if(n == 0) return 1.0;

	double result = 1.0;

	if(n>0){
		for(int i = 0; i < n; i++){
			result *= x;
		}else{
			for(int i = n; i < 0; i++){
				result *= (1.0/(x));
			}
		}

		return result;
	}
		
