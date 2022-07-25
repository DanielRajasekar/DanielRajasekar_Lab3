package com.binarytree.main;
import java.util.*;

class FindSumPair {
		public Node insert(Node root , int key) 
		{
			
			if(root == null)
				return new Node(key);
			if(key < root.NodeData)
				root.leftNode = insert(root.leftNode, key);
			else
				root.rightNode = insert(root.rightNode, key);
			return root;
		}
		public boolean findpairUtil(Node root, int sum,
				HashSet<Integer> set)
		{
			if(root ==null)
				return false;
			
			if(findpairUtil(root.leftNode,sum,set))
				return true;
			
			if(set.contains(sum - root.NodeData)) {
				System.out.println("pair is found("
						+ (sum-root.NodeData)+ ","
						+ root.NodeData +")");
				return true;
				
			}
			else
				set.add(root.NodeData);
			return findpairUtil(root.rightNode,sum,set);
		}
		public void findPairWithGivenSum(Node root, int sum) {
		
			HashSet<Integer>set = new HashSet<Integer>();
			if(!findpairUtil(root, sum, set))
				System.out.println("pair do not exit"+"\n");
		}
}
