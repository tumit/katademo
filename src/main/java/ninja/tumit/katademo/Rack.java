package ninja.tumit.katademo;

import java.util.ArrayList;
import java.util.List;

public class Rack {
	
	Node root;
	List<String> result;
	
	private String toLetterOnly(String value) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < value.length(); i++) {
			if(Character.isLetter(value.charAt(i))) {
				sb.append(value.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public String getSortString(String value) {
		
		value = toLetterOnly(value.toLowerCase());
		
		for (int i = 0; i < value.length(); i++) {
			addToBinarySearchTree(value.charAt(i));
		}
		
		return toStringFromBinarySearchTree();
	}
	
	private String toStringFromBinarySearchTree() {

		result = new ArrayList<String>();
				
		toStringFromBinarySearchTree(this.root);
		
		return String.join("", this.result);
	}

	private void toStringFromBinarySearchTree(Node node) {		
		if(node != null) {
			toStringFromBinarySearchTree(node.left);
			this.result.add(String.valueOf(node.value));
			toStringFromBinarySearchTree(node.right);			
		}				
	}	
	
	private void addToBinarySearchTree(char ch) {
		
		Node newNode = new Node(ch);
		
		if(this.root == null) {
			this.root = newNode;
			System.out.println("go to root: value=" + ch);
			return;
		}
				
		Node currentNode = this.root;
		
		while(true) {
			if(ch <= currentNode.value) {			
				if(currentNode.left == null) {
					currentNode.left = newNode;
					System.out.println("go to node.left: value=" + ch);
					return;
				} 	
				
				currentNode = currentNode.left;
				
			} else {			
				if(currentNode.right == null) {
					currentNode.right = newNode;
					System.out.println("go to node.right: value=" + ch);
					return;
				}
				
				currentNode = currentNode.right;
			}				
		}
	}


}
