package zjs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class L2023120243_5_Test {
// 测试用例设计总体原则：
    // 1. 等价类划分：根据输入参数的特性，将所有可能的输入分为几个等价类，并从中选择具有代表性的测试用例。
    // 2. 边界值分析：针对边界条件进行测试，确保算法能够正确处理最小值、最大值等情况。
    // 3. 错误猜测：基于经验预测可能出现错误的情况，并设计相应的测试用例。

    private Solution5 solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution5();
    }

    /**
     * 测试目的：验证当nums为空数组时，返回结果为0。
     * 测试用例：nums = [], target = 10
     */
    @Test
    public void testEmptyArray() {
        assertEquals(0, solution.numSubseq(new int[]{}, 10));
    }

    /**
     * 测试目的：验证单元素数组且满足条件时，返回结果为1。
     * 测试用例：nums = [5], target = 10
     */
    @Test
    public void testSingleElementArray() {
        assertEquals(1, solution.numSubseq(new int[]{5}, 10));
    }

    /**
     * 测试目的：验证多元素数组，其中部分子序列满足条件。
     * 测试用例：nums = [3, 5, 6, 7], target = 9
     */
    @Test
    public void testMultipleElementsSomeValid() {
        assertEquals(4, solution.numSubseq(new int[]{3, 5, 6, 7}, 9));
    }

    /**
     * 测试目的：验证多元素数组，其中部分子序列满足条件。
     * 测试用例：nums = [2, 3, 3, 4, 6, 7], target = 12
     */
    @Test
    public void testMultipleElementsSomeValidWithSameNumber() {
        assertEquals(61, solution.numSubseq(new int[]{2, 3, 3, 4, 6, 7}, 12));
    }

    /**
     * 测试目的：验证多元素数组，所有子序列都不满足条件。
     * 测试用例：nums = [10, 20, 30], target = 15
     */
    @Test
    public void testNoValidSubsequences() {
        assertEquals(0, solution.numSubseq(new int[]{10, 20, 30}, 15));
    }
}
