package com.wangwang.yangstudyservice.file.leetcode.twoSum;


import lombok.extern.slf4j.Slf4j;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
class Solution
{
    // start from first preorder element
    int pre_idx = 0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

    public String longestPalindrome(String s)
    {
        int n = s.length();

        int max = 0;
        int l = 0;
        Boolean [][] dp = new Boolean[n][n];

        for(int i = 0; i < n; i++)
        {
            dp[i][i] = true;
        }

        for (int i = n-1; i >=0; i--)
        {
            for (int j = i+1;j<n;j++)
            {
                if (s.charAt(i) == s.charAt(j))
                {
                    if((j-i)<3) dp[i][j] = true;
                    else dp[i][j] = dp[i+1][j-1];
                }

                if(dp[i][j])
                {
                    int curr = j -i +1;
                    Math.max()
                    if(curr > max)
                    {
                        max = curr;
                        l = i;
                    }
                }

            }

        }
        return  s.substring(l,l+max);





    }
    public TreeNode helper(int in_left, int in_right)
    {
        // if there is no elements to construct subtrees
        if (in_left == in_right) return null;

        // pick up pre_idx element as a root
        int root_val = preorder[pre_idx];
        TreeNode root = new TreeNode(root_val);

        // root splits inorder list
        // into left and right subtrees
        int index = idx_map.get(root_val);

        // recursion
        pre_idx++;
        // build left subtree
        root.left = helper(in_left, index);
        // build right subtree
        root.right = helper(index + 1, in_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        this.preorder = preorder;
        this.inorder = inorder;

        // build a hashmap value -> its index
        int idx = 0;
        for (Integer val : inorder)
            idx_map.put(val, idx++);
        return helper(0, inorder.length);
    }


    class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val)
        {
            this.val = val;
        }

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


//    List<List<Integer>> flagList = new ArrayList<>();
//
//    public String rankTeams(String[] votes)
//    {
//        if(votes.length == 1) return votes[0];
//
//        String[] flag = votes[0].split("");
//
//        if(flag.length == 1) return flag[0];
//
//        int [][] count = new int[flag.length][flag.length];
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < flag.length; i++)
//        {
//            for (int num = 0; num < flag.length; num++)
//            {
//                for (int j = 0; j < votes.length; j++)
//                {
//                    if (flag[num].equals(votes[j].substring(i, i + 1))) count[i][num]++;
//                }
//            }
//
//        }
//
//        for (int i = 0; i < flag.length; i++)
//        {
//            int max = count[i][0];
//            int maxA = Integer.MIN_VALUE;
//
//            for (int j = 0; j <flag.length; j++)
//            {
//                if(count[i][j] > max)
//                {
//                    max = count[i][j];
//                    maxA = j;
//                }
//                else if((count[i][j] == maxA) )
//                {
//                    if(i == flag.length-1)
//                    {
//
//                    }
//                }
//
//            }
//            stringBuilder.append(flag[maxA]);
//        }
//
//        return stringBuilder.toString();
//
//    }


    public static void main(String[] args)
    {

        String s = "1234";
        String l = s.substring(3, 4);
        System.out.println(l);
    }
}





