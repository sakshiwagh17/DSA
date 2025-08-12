class Solution {
    public List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col <= row; col++) {
            ans = ans * (row - col + 1);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            result.add(generateRow(row));
        }
        return result;
    }
}
