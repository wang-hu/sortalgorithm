package com.wanghu.day11;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 你可以假设除了整数 0 之外，这个整数不会以零开头。

 示例 1:
 输入: [1,2,3]
 输出: [1,2,4]
 解释: 输入数组表示数字 123。

 示例 2:
 输入: [4,3,2,1]
 输出: [4,3,2,2]
 解释: 输入数组表示数字 4321。
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Solution {

    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(plusOne(digits));
    }


    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] % 10 !=0) {
                return digits;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;


    }
}
