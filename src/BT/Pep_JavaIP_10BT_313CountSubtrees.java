package BT;

import java.util.Scanner;

public class Pep_JavaIP_10BT_313CountSubtrees {

	static class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		Node root;
		int size;

		public BinaryTree(int data) {
			this.root=new Node();
			this.root.data = data;
		}

		public void BinaryTreeConstruct(int one, int two, char side) {
			this.root = construct(root, one, two, side);
		}

		private Node construct(Node node, int one, int two, char side) {
			if(node==null) {
				return null;
			}
			if (node.data == one) {
				// activity to be done
				Node newnode = new Node();
				newnode.data = two;
				if (side == 'L') {
					node.left = newnode;
				} else {
					node.right = newnode;
				}

				return node;
			}
			

			Node ls = construct(node.left, one, two, side);
			Node rs = construct(node.right, one, two, side);

			return node;
		}
		static int count=0; 
		public int countofSubtrees(int targetSum) {
			root.data=countofSubtrees(targetSum,root);
			if(root.data==targetSum) {
				count++;
			}
			return count;
		}
		
		private int countofSubtrees(int targetSum, Node node) {
			if(node==null) {
				return 0;
			}
			
			int lsum=countofSubtrees(targetSum, node.left);
			int rsum=countofSubtrees(targetSum, node.right);
			node.data+=lsum+rsum;
			if(node.data==targetSum) {
				count++;
			}
			
			return node.data;
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int numberEdges = scn.nextInt();
		int rootdata = scn.nextInt();
		BinaryTree bt=new BinaryTree(rootdata);
		int rootconnectData=scn.nextInt();
		char sideroot=scn.next().charAt(0);
		bt.BinaryTreeConstruct(rootdata, rootconnectData, sideroot);
		
		for(int i=1; i<numberEdges; i++) {
			int one=scn.nextInt();
			int two=scn.nextInt();
			char side=scn.next().charAt(0);
			bt.BinaryTreeConstruct(one, two, side);
		}
		
		int targetSum=scn.nextInt();
		
		int count=bt.countofSubtrees(targetSum);
		System.out.println(count);
	}

}

/*
2
1 2 L 1 3 R
5
0


6
5 -10 L 5 3 R -10 9 L -10 8 R 3 -4 L 3 7 R
7
2*/
