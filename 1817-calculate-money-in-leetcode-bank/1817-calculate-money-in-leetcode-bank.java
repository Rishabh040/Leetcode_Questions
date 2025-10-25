class Solution {
    int triSum(int n) {
        return (n * (n+1)) >> 1;
    }
    public int totalMoney(int days){
        int weeks = days/7;
        int day = days%7;

        return triSum(days) - 42 * triSum(weeks - 1) - 6 * weeks * day;
    }
}