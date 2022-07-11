// 1 <= chips.length <= 100
// 1 <= chips[i] <= 10^9
class Solution {
    public int minCostToMoveChips(int[] position) {
        int sum1 = 0; 
        for(int i : position) {
            sum1 += i % 2;
        }
        return Math.min(sum1, position.length-sum1);
    }
}

#Alog
要学：贪心算法。




