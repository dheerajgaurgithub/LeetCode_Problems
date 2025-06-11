class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int duplicate = x;
        int reverse = 0;

        while (x != 0) {
            int lastdigit = x % 10;
            x /= 10;

            if (reverse > Integer.MAX_VALUE / 10 || 
                (reverse == Integer.MAX_VALUE / 10 && lastdigit > 7)) 
                return false;

            reverse = reverse * 10 + lastdigit;
        }

        return reverse == duplicate;
    }
}
