class Solution {
    public int maximumWealth(int[][] accounts) {
        int i, j;
        int maxWealth = 0;
        for (i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}