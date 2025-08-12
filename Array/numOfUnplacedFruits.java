class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt = 0;
        for (int fruit : fruits) {
               boolean placed=false;
            for (int i = 0; i < baskets.length; i++) {
                if (fruit <= baskets[i]) {
                    baskets[i] = 0;
                    placed=true;
                    break;
                }
            }
            if(!placed){
                cnt++;
            }

        }
        return cnt;
    }
}
