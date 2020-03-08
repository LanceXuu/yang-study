//package com.wangwang.yangstudyservice.file.dataStructure;
//
//import java.util.Hashtable;
//
///**
// * @program: yang-study
// * @description:
// * @author: xuyang
// * @create: 2020-03-03 08:58
// **/
//class LRUCache
//{
//
//    private Hashtable<Integer,LinkNodeList> hs = new Hashtable<Integer,LinkNodeList>();
//
//    private LinkNodeList head,tail;
//    int size,capacity;
//
//    class LinkNodeList
//    {
//        int key;
//        int value;
//
//        LinkNodeList pre;
//        LinkNodeList next;
//    }
//
//
//
//
//    private void addNode(LinkNodeList node)
//    {
//        node.next = head.next;
//        node.pre = head;
//
//        head.next.pre = node;
//        head.next = node;
//
//    }
//
//    private void removeNode(LinkNodeList node)
//    {
//        node.pre.next = node.next;
//        node.next.pre = node.pre;
//    }
//
//    private void moveToHead(LinkNodeList node)
//    {
//        removeNode(node);
//        addNode(node);
//    }
//
//    private LinkNodeList popTail()
//    {
//        LinkNodeList node = tail.pre;
//        removeNode(node);
//
//        return node;
//    }
//
//    public LRUCache(int capacity)
//    {
//        this.capacity = capacity;
//        this.size = 0;
//    }
//
//    public int get(int key)
//    {
//        LinkNodeList node = hs.get(key);
//
//        if(node ==null)
//        {
//            return -1;
//        }
//
//        moveToHead(node);
//        return node.value;
//    }
//
//    public void put(int key, int value)
//    {
//        LinkNodeList node = hs.get(key);
//
//        if(node == null)
//        {
//            LinkNodeList node = new LinkNodeList();
//            node.key = key;
//            node.value = value;
//
//            hs.put(key,node);
//            addNode(node);
//
//            ++size;
//
//            if(size > capacity)
//            {
//                LinkNodeList tail = popTail();
//                hs.remove(tail.key);
//            }
//        }
//
//    }
//}
