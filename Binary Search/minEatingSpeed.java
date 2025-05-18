class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;  // as 1 banana per hour
        int high = getMax(piles);

        while (low <high) {
            int mid = low + (high - low) / 2;
            int hours = getHours(piles, mid);
            if (hours <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }

    //to calculate the max pile
    public int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }

        }
        return max;
    }
    //to get the max hours
    public int getHours(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }
        return hours;
    }
}
