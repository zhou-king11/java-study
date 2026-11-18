
static void main() {


    class Solution {
        public int maxSubArray(int[] nums) {
            int cur = 0;           // 当前连续和
            int best = nums[0];    // 历史最大值，初始化为第一个数
            for (int x : nums) {
                cur += x;              // 累加
                if (cur > best) best = cur;   // 更新最大值
                if (cur < 0) cur = 0;         // 变负数就丢掉，重新开始
            }
            return best;
        }
    }
}
