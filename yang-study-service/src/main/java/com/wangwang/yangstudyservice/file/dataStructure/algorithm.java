package com.wangwang.yangstudyservice.file.dataStructure;

import java.util.Arrays;

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
            public void sort(int [] arr)
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
            public void heaInsert(int [] arr, int index)
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
            public void heapify(int[]arr,int index,int heapSize)
            {
                int left = index * 2 + 1;
                while (left < heapSize)
                {

                    int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;

                    if(largest == index)
                    {
                        break;
                    }
                    swap(arr,index,largest);

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

        public int [] partition(int[] arr, int low, int high)
        {
            int l = low - 1;
            int h = high;

            while (low < h)
            {
                if(arr[low] < arr[high])
                {
                    swap(arr, ++l, low++);
                }
                else if(arr[low] > arr[high])
                {
                    swap(arr, --h, low);
                }
                else
                {
                    low++;
                }
            }

            swap(arr, high, h);
            return new int[]{l + 1,h};
        }
    }
}
