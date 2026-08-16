class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] rem = new int[3];

        for (int stone : stones) {
            rem[stone % 3]++;
        }

        if (rem[0] % 2 == 0) {
            return rem[1] > 0 && rem[2] > 0;
        }

        return Math.abs(rem[1] - rem[2]) > 2;
    }
}