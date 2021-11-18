import java.util.HashSet;

public class Solution1 {
    public int findRepeatNumber(int[] nums) {
        // HashSet
        HashSet<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            //发现某元素存在，返回
            if (set.contains(x)) {
                return x;
            }
            //存入哈希表
            set.add(x);
        }
        return -1;

    }
}
