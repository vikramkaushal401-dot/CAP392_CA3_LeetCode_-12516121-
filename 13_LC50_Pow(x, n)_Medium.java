class Solution {
    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            power = -power;
            return 1.0 / findPower(x, power);
        }
        return findPower(x, power);
    }

    double findPower(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double half = findPower(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
