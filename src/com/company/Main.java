package com.company;

import google.*;
import java.util.*;



public class Main {
//
//    public static int solution (int X) {
//
//        googleRoundupAverage grA = new googleRoundupAverage();
//
//        System.out.println(grA.solution(623315));
//        return 0;
//    }
//        String in = ""+X;
//        int max = Integer.MIN_VALUE;
//        for(int i = 0;i<in.length();i++){
//            //average
//            char t = in.charAt(i);
//            String prefix = "";
//            String suffix = "";
//            StringBuilder sb = new StringBuilder();
//
//            if(i> 1){
//                prefix = in.substring(0,i);
//            }
//            if(i < in.length()-1){
//                suffix = in.substring(i,in.length());
//            }
//            sb.append(prefix);
//            sb.append(t);
//            sb.append(suffix);
//            int res = Integer.valueOf(sb.toString());
//            //int ret = Integer.parseInt(prefix+t+suffix);
//            //
//            // System.out.println(ret);
//
//            max = Math.max(max, res);
//        }
//        return max;
//        //return min;
//    }
//}

//    class Element{
//        public int number;
//        public int count;
//        public Element(int number,int count){
//            this.number = number;
//            this.count = count;
//        }
//    }

    public static String rearrangeString(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        PriorityQueue<Element> maxheap = new PriorityQueue<Element>(new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o2.count - o1.count;
            }
        });

        for(char c: map.keySet()){
            maxheap.offer(new Element(c, map.get(c)));
        }

        StringBuilder sb = new StringBuilder();
        while(maxheap.size()>0){
            Element e1 = maxheap.poll();

            //maxHeap just have one element
            if(maxheap.isEmpty()){
                sb.append(e1.number);
                break;
            }
            Element e2 = maxheap.poll();
            sb.append(e1.number);
            sb.append(e2.number);

            if(e1.count>1){
                e1.count--;
                maxheap.offer(e1);
            }

            if(e2.count>1){
                e2.count--;
                maxheap.offer(e2);
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();


        LinkedList h1 = new LinkedList();
        h1.add(1);
        h1.add(2);

        LinkedList h2 = new LinkedList();

        h2.add(3);
        h2.add(4);
        h2.add(5);
        h2.add(6);

        zigzagIterator zz = new zigzagIterator(h1,h2);
        zz.next();
        zz.next();
        zz.next();
        zz.hasNext();

        TreeNode root = new TreeNode(1);

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node1.children.add(node4);
        node4.children.add(node5);
        node5.children.add(node6);



        employeeDepth ee = new employeeDepth();
        System.out.println(ee.employeeDepth(root, 0));
        System.out.println(ee.employbfs(root));







//        int[] nums = {4,3,2,7,8,2,3,1};
//        Leetcode448_findAll ll = new Leetcode448_findAll();
//        ll.findDisappearedNumbers(nums);
//        int X = 233614;
//        google1 gg = new google1();
//        System.out.println(gg.solution(X));
//        System.out.println(gg.minSolution(X));
//
//        googleRoundupAverage ggg = new googleRoundupAverage();
//        System.out.println(ggg.solution(623315));
//        String s = "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext";
//        longestAbsoluteFilepat longest = new  longestAbsoluteFilepat();
//        System.out.println(longest.lengthLongestPath(s));
//
//        googleTest test = new googleTest();
//        String input = "dir\n subdir1\n s\n  file.png";
//        System.out.println(test.getLength(input));
//        sortTransformedArray ss = new sortTransformedArray();
//        int[] nums1 = {-4, -2, 2, 4};
//        ss.sortTransformedArray(nums1,-1,3,5);
//        googleRoundupAverage grA = new googleRoundupAverage();
//
//        System.out.println(grA.solution(623315));
//        System.out.println('1'+0);
//        System.out.println('1'-48);
//        magicString mm = new magicString();
//        System.out.println(mm.magicalString(8));
//        String[] words = {"area","lead","wall","lady","ball"};
//        LeetCode425_Word_Squares leet = new LeetCode425_Word_Squares();
//        leet.wordSquares(words);
//        longestAbsoluteFilepat p = new longestAbsoluteFilepat();
//        String input1 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
//        p.lengthLongestPath(input1);
//        // write your code here
//        Leetcode_Generalized_Abbreviation ga = new Leetcode_Generalized_Abbreviation();
//        ga.generateAbbreviation("word");
//        int[] findNums = {4,1,2};
//        int[] nums11 = {1,3,4,2};
//        NextGreaterNumber nn = new NextGreaterNumber();
//        NextGreaterElement2 gggggg = new NextGreaterElement2();
//        gggggg.nextGreaterElements(nums11);
//        nn.nextGreaterElement(findNums,nums11);
    }
        }

