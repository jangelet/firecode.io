// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int reverseInt(int x) {
              
    if(x < 10 && x > -10) return x;
    if(x == -10) return -1;
    if(x == 10) return 1; 
    //mod 10 to get last digit
    //mult that digit by greatest 10th (if 123, mult 3 by 100, then 2 by 10, then 1 by 1 -- keep adding)
    int input = x;
    int reversed = 0;
    
    if(input < 0) input *= -1; //makes input positive 
    
    //obtains greatest power of ten that divides the input
    int pwrOfTen = 10;
    while (pwrOfTen < input/10) {
        pwrOfTen *= 10;
    }
    
    while(input > 0){
        int last = input%10;
        input /= 10;
        reversed += (last * pwrOfTen);
        pwrOfTen /= 10;
    }
    
    //sets reversed integer to negative if x was negative
    if(x < 0) reversed *= -1;
    
    return reversed;
    
}