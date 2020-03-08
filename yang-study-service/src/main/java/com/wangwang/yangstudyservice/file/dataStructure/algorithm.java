package com.wangwang.yangstudyservice.file.dataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

/**
 * @program: yang-study
 * @description: for study algorithm
 * @author: xuyang
 * @create: 2020-02-22 17:16
 **/
public class algorithm
{

    public static void main(String[] args)
    {
        int[] arr = {0, 5, 7, 2, 1, 3};
        new algorithm().new HeapSort().sort(arr);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }

    /**
     * a function for exchange the value between two index
     */
    public void swap(int[] flagArray, int i, int j)
    {
        int temp = flagArray[i];

        flagArray[i] = flagArray[j];
        flagArray[j] = temp;
    }


    /**
     * @Description: 前缀树学习
     * @Param:
     * @return:
     * @Author: xuyang
     * @Date: 2020/3/4
     */
    class Trie
    {
        public class TrieNode
        {
            public int path;
            public int end;
            public TrieNode[] next;

            public TrieNode()
            {
                end = 0;
                path = 0;

                next = new TrieNode[26];
            }

        }

        class TrieInner
        {
            private TrieNode root;

            public TrieInner()
            {
                root = new TrieNode();
            }


            public void insert(String word)
            {
                if (word == null)
                {
                    return;
                }

                char[] chs = word.toCharArray();
                TrieNode node = root;
                int index = 0;

                for (int i = 0; i < chs.length; i++)
                {
                    index = chs[i] - 'a';
                    if (node.next[index] == null)
                    {
                        node.next[index] = new TrieNode();
                    }
                    node = node.next[index];
                    node.path++;
                }
                node.end++;


            }

            public void delete(String word)
            {
                if (search(word) == 0) return;

                char[] chs = word.toCharArray();
                TrieNode node = root;
                int index = 0;

                for (int i = 0; i < chs.length; i++)
                {
                    index = chs[i] - 'a';

                    if (--node.next[index].path == 0)
                    {
                        node.next[index] = null;
                        return;
                    }

                    node = node.next[index];
                }
                node.end--;

            }

            public int search(String word)
            {
                if (word == null) return 0;

                char[] chs = word.toCharArray();
                TrieNode node = root;
                int index = 0;

                for (int i = 0; i < chs.length; i++)
                {
                    index = chs[i] - 'a';
                    if (node.next[index] == null)
                    {
                        return 0;
                    }

                    node = node.next[index];
                }
                return node.end;
            }

        }
    }

    /**
     * @Description: Realize the binary tree by recursive
     * @Param:
     * @return:
     * @Author: xuyang
     * @Date: 2020/2/25
     */
    class Binary
    {
        /**
         * 二叉树的一个节点
         */
        class Node
        {
            public int val;
            public Node left;
            public Node right;

            public Node(int data)
            {
                this.val = data;
            }
        }


        public void preOrderTraverse(Node node)
        {
            Stack<Node> stack = new Stack();
            stack.push(node);

            while (!stack.isEmpty())
            {
                Node flag = stack.pop();

                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);

                System.out.println(flag.val);
            }

        }

        public void inOrderTraverse(Node node)
        {
            Stack<Node> stack = new Stack();

            while (!stack.isEmpty() || node != null)
            {
                if (node != null)
                {
                    stack.push(node);
                    node = node.left;
                }
                else
                {
                    node = stack.pop();
                    System.out.println(node.val);
                    node = node.right;
                }

            }

        }

        public void postOrderTraverse(Node node)
        {
            Stack<Node> stack = new Stack();
            Stack<Node> helpStack = new Stack();
            stack.push(node);

            while (!stack.isEmpty())
            {
                Node flag = stack.pop();
                helpStack.push(flag);

                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
            }

            for (int i = 0; i < helpStack.size(); i++)
            {
                System.out.println(helpStack.pop().val);
            }

        }

    }


    /**
     * @Description: Quene Implement BY Array
     * @Param:
     * @return:
     * @Author: xuyang
     * @Date: 2020/2/24
     */
    class QueneImplementBYArray
    {
        int[] arr;
        int size;
        int start;
        int end;

        public QueneImplementBYArray(int initSize)
        {
            if (initSize < 0) throw new IllegalArgumentException("the init size is less than 0");

            arr = new int[initSize];
            size = 0;
            start = 0;
            end = 0;
        }

        public void push(int num)
        {
            if (size == arr.length) throw new IllegalArgumentException("the array is full");
            size++;

            arr[end] = num;
            end = end == arr.length - 1 ? 0 : end + 1;
        }

        public int pop()
        {
            if (size == 0) throw new IllegalArgumentException("the array is empty");
            size--;

            int temp = start;
            start = start == arr.length - 1 ? 0 : start + 1;
            return arr[temp];
        }
    }


    /**
     * @Description: Stack implement by array
     * @Param: arr[]
     * @return: null
     * @Author: xuyang
     * @Date: 2020/2/24
     */
    class StackImplementByArray
    {
        int index;
        int[] arr;

        public StackImplementByArray(int index, int[] arr, int initSize)
        {
            this.index = index;
            this.arr = arr;

            arr = new int[]{initSize};
        }

        public void push(int[] arr, int num)
        {
            if (index == 0) throw new IllegalArgumentException("the arr has not init");
            arr[index++] = num;
        }

        public int pop(int[] arr) throws IllegalAccessException
        {
            if (index == 0) throw new IllegalAccessException("there is nothing to pop");
            return arr[--index];
        }

        public int peek(int[] arr) throws IllegalAccessException
        {
            if (index == 0) throw new IllegalAccessException("there is nothing to pop");
            return arr[index];
        }
    }

    /**
     * @Description: Basic Algorithm mind
     * @Param:
     * @return:
     * @Author: xuyang
     * @Date: 2020/2/22
     */
    class BasicAlgorithm
    {
        /**
         * 荷兰国旗
         */
        public int[] fun(int[] arr, int num, int L, int R)
        {
            int low = L - 1;
            int high = R + 1;

            int index = L;

            while (index < R)
            {
                if (arr[index] < num) swap(arr, ++low, index++);

                else if (arr[index] > num) swap(arr, --high, index);

                else index++;
            }

            return new int[]{low + 1, high - 1};
        }
    }

    /**
     * @Description: 堆排序的实现
     * @Param:
     * @return:
     * @Author: xuyang
     * @Date: 2020/2/22
     */
    class HeapSort
    {
        public void sort(int[] arr)
        {
            if (arr == null || arr.length < 2) return;
            for (int i = 0; i < arr.length; i++)
            {
                heaInsert(arr, i);
            }

            int heapSize = arr.length;
            swap(arr, 0, --heapSize);
            while (heapSize > 0)
            {
                heapify(arr, 0, heapSize);
                swap(arr, 0, --heapSize);
            }
        }

        /**
         * 大根堆化——————————找爸爸。我比你大我就上升！！
         * 复杂度：O(N)
         */
        public void heaInsert(int[] arr, int index)
        {
            while (arr[index] > arr[(index - 1) / 2])
            {
                swap(arr, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }

        /**
         * 如果我比我的子节点小，则我就下降
         */
        public void heapify(int[] arr, int index, int heapSize)
        {
            int left = index * 2 + 1;
            while (left < heapSize)
            {

                int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;

                if (largest == index)
                {
                    break;
                }
                swap(arr, index, largest);

                index = largest;
                left = index * 2 + 1;

            }
        }


    }

    /**
     * @Description: 快速排序的实现
     * @Param:
     * @return:
     * @Author: xuyang
     * @Date: 2020/2/22
     */
    class QuickSort
    {
        public void sort(int[] arr)
        {
            if (arr == null || arr.length < 2) return;
            quickSort(arr, 0, arr.length - 1);
        }

        public void quickSort(int[] arr, int low, int high)
        {
            if (low < high)
            {
                swap(arr, 1 + (int) (Math.random() * (high - low + 1)), high);
                int[] p = partition(arr, low, high);

                quickSort(arr, low, p[0] - 1);
                quickSort(arr, p[1] + 1, high);
            }

        }

        public int[] partition(int[] arr, int low, int high)
        {
            int l = low - 1;
            int h = high;

            while (low < h)
            {
                if (arr[low] < arr[high])
                {
                    swap(arr, ++l, low++);
                }
                else if (arr[low] > arr[high])
                {
                    swap(arr, --h, low);
                }
                else
                {
                    low++;
                }
            }

            swap(arr, high, h);
            return new int[]{l + 1, h};
        }
    }
}
