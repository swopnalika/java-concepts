package org.objects;

public class Factorial {
    int fact(int n) {
        int result;
        if (n == 1)
            return n;
        else
            result = (n * fact(n - 1));
        return result;
    }

}
