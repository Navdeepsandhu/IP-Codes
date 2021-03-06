package LinkedList;

import java.util.Scanner;

public class Pep_JavaIP_9LinkedList_288FlattenMultiLevelLinkedListDepthWise {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// This is for the main linked list of size n
		for (int i = 0; i < n; i++) {
			int a = scn.nextInt();
			Node np = insert(a);
			// do you have down child
			char choice = scn.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				// make recursive calls with np
				np.down = insertbelow(scn);
			} else {
				continue;
			}
		}
		flatten(head);
	}

	private static Node insertbelow(Scanner scn) {
		Node np=null;
		np = new Node(scn.nextInt(), null, null);
		// Do you have down child
		char choice = scn.next().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			// create a node and then call
			
			np.down = insertbelow(scn);
		}
		// do you have right child
		choice = scn.next().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			// create a node and then call
			np.next = insertbelow(scn);

		}
		return np;
	}

	static Node head;
	static Node tail;
	static int size;

	private static class Node {
		int data;
		Node next;
		Node down;

		public Node(int data, Node next, Node down) {
			this.data = data;
			this.next = next;
			this.down = down;
		}
	}

	private static Node insert(int data) {
		Node nn = new Node(data, null, null);
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			tail.next = nn;
			tail = nn;
		}
		return nn;

	}
	
	public static void display(Node n) {
		for (Node node = n; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
	}
	// ---------------------------------------------
	// This is a functional problem. You have to write just this function to solve
	// the problem.

	public static void flatten(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data+" ");
		flatten(node.down);

		flatten(node.next);
	}

	// ---------------------------------------------
}
/*Test cases:
5
10 Y 4 N Y 20 Y 2 N n Y 13 Y 16 Y 3 N N N N 5 N 12 N 7 Y 17 y 9 y 19 n y 15 n n y 8 n n y 6 n n 11 N
---------------------
10 4 20 2 13 16 3 5 12 7 17 9 19 15 8 6 11 

4
10 Y 4 N Y 20 Y 2 N n Y 13 Y 16 Y 3 N N N N 5 N 12 N 7 Y 17 y 9 y 19 n y 15 n n y 8 n n y 6 n n
-----------------------------------
10 4 20 2 13 16 3 5 12 7 17 9 19 15 8 6 


Source: https://www.geeksforgeeks.org/flatten-a-multi-level-linked-list-set-2-depth-wise/
*/

