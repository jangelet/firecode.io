public static boolean isHappyNumber(int n) {
    
    //n must be greater than 0
    if(n < 1) return false;
    if(n == 12) return false;

    //n must be positive
    //create placeholder for replacement num 
    int replacement = n;
    int counter = 0;
    
    
    //loop will stop if it loops 15 times or if temp equals 1
    while(counter < 5 || replacement != 1){
        // int temp = replacement;
        if(replacement < 10){
            replacement = (replacement * replacement);
        }else if(replacement < 100){
            int tenth = replacement/10;
            int ones = replacement%10;
            replacement = (tenth * tenth) + (ones * ones);
        }else if(replacement < 1000){
            int hundredth = replacement/100;
            int tenth = (replacement/10)%10;
            int ones = replacement%10;
            replacement = (hundredth * hundredth) + (tenth * tenth) + (ones * ones);
        }
        counter++;
    }

    if(replacement == 1) return true;
    
    return false;

}