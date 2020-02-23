package com.wangwang.yangstudyservice.file.leetcode;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-08-16 10:52
 **/

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class Solution
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null)
        {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1)
        {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }



    public int[] twoSum(int[] nums, int target)
    {
        int[] flag = new int[2];

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {


                if (nums[i] + nums[j] != target)
                {
                    continue;
                }

                flag[0] = i;
                flag[1] = j;
            }

        }
        return flag;

    }


    public int[] twoSum(int[] nums, int target, int p)
    {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++)
        {
            int a = nums[i];
            // note that the numbers in the array can be negative as well
            if (map.get(target - a) != null)
            {
                return new int[]{map.get(target - a), i};
            }
            // The following should be after the check above,
            // otherwise it will fail for the case where target = 6 and there's a 3 in the original array.
            map.put(a, i);
        }
        return null;
    }


    public static void main(String[] args)
    {
        Solution solution = new Solution();

        int[] temp = new int[4];

        temp[0] = 2;
        temp[1] = 7;
        temp[2] = 11;
        temp[3] = 15;

        solution.twoSum(temp, 9, 1);
    }

    public class ListNode
    {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }
}
