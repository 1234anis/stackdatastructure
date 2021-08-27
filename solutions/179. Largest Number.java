class Solution {
    public String largestNumber(int[] nums) {
         if (nums == null || nums.length == 0) return "0";  // or throw exception
        final int N = nums.length;
        String[] strs = new String[N];
        int M = 0;
        for (int i = 0; i < N; i++) {
            strs[i] = String.valueOf(nums[i]);
            M += strs[i].length();
        }
        Arrays.sort(strs, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        if (strs[0].equals("0")) {   // all the numbers are 0
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
