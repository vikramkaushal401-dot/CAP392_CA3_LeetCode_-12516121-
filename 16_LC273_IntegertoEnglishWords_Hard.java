class Solution {
    String[] below20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String result = "";
        if (num >= 1000000000) {
            result += threeDigits(num / 1000000000) + " Billion ";
            num = num % 1000000000;
        }
        if (num >= 1000000) {
            result += threeDigits(num / 1000000) + " Million ";
            num = num % 1000000;
        }
        if (num >= 1000) {
            result += threeDigits(num / 1000) + " Thousand ";
            num = num % 1000;
        }
        if (num > 0) {
            result += threeDigits(num);
        }
        return result.trim();
    }

    String threeDigits(int n) {
        String s = "";
        if (n >= 100) {
            s += below20[n / 100] + " Hundred ";
            n = n % 100;
        }
        if (n >= 20) {
            s += tens[n / 10] + " ";
            n = n % 10;
        }
        if (n > 0) {
            s += below20[n] + " ";
        }
        return s.trim();
    }
}
