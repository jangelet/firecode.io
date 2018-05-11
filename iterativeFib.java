// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int fib(int n) {

    if(n == 0) return 0;
    if(n == 1 || n == 2) return 1;
    
    //(n-2) + (n-1) = n
    int sequence = 3;
    int a = 1;
    int b = 2;
    
    while(sequence != n){
        int temp = b;
        b += a;
        a = temp;
        sequence++;
    }
    
    return b;
}