class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) res.add(nums[i]);
        }
        return new int[]{res.get(0), res.get(1)};
        
    }
}