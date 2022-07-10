class NodeBst{
	
	NodeBst left;
	NodeBst right;
	int data;
	
}

class operationbst{
	
	public NodeBst insert(NodeBst node, int data) {
		
		if(node == null) {
			NodeBst bstNode = new NodeBst();
			bstNode.data = data;
			bstNode.left = null;
			bstNode.right = null; 
			return bstNode;
		} else {
			
			if(data < node.data) {
				node.left = insert(node.left, data) ;
			} else if(data > node.data) {
				node.right = insert(node.right, data);
			}
			
		}
		return node;	
	}
	
	public NodeBst delete(NodeBst node, int data) {
		
		if(node == null) {
			return null;
		}
		
		if(data < node.data) {
			node.left =  delete(node.left, data);
		}  else if (data > node.data) {
			node.right = delete(node.right, data);
		} else {
			if(node.left == null || node.right == null) {
				NodeBst tmp = null;
				tmp = node.left == null ? node.right : node.left;
				if(tmp == null) {
					return null;
				} else {
					return node;
				}
			}  else {
				NodeBst successor = getsuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right,successor.data);
			}
		}
		return node;
	}

	private NodeBst getsuccessor(NodeBst node) {
		if(node == null) {
			return null;
		}
		NodeBst temp = node.right;
		while(temp.left!=null) {
			temp = temp.left;
		}
		return temp;
	}
}

public class BST {

	public static void main(String[] args) {
	operationbst bst = new operationbst();
	NodeBst root = null;
	root = bst.insert(root, 8);
	root = bst.insert(root, 3);
	root = bst.insert(root, 6);
	root = bst.insert(root, 1);
	root = bst.insert(root, 10);
	root = bst.insert(root, 4);
	root = bst.insert(root, 7);
	root = bst.insert(root, 14);
	root = bst.insert(root, 13);
	
	root = bst.delete(root, 3);

	}

}
