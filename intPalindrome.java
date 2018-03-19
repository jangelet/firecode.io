public static Boolean isIntPalindrome(int x) {            

    if(x < 0) return false;
    if(x < 10) return true;
    
    int input = x;
    int remainder = 0;
    int reverse = 0;
    
    while(input > 0){
        remainder = input%10;
        reverse = reverse * 10 + remainder;
        input /= 10;
        
    }
    if(reverse == x) return true;
    return false;
}