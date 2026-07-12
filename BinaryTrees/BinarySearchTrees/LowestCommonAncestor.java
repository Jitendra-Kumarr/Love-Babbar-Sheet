

/**
 * LowestCommonAncestor
 */
class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class LowestCommonAncestor {

    public Node lowestCommonAncestor(Node root, Node p, Node q){
        Node curr = root; 

        while (curr != null) {
            if(p.val > curr.val && q.val > curr.val){
                curr = curr.right; 
            } else if (p.val < curr.val && q.val < curr.val){
                curr = curr.left; 
            } else {
                return curr; 
            }
        }
        return null;
    }

    public static Node insert(Node node, int val){
        if(node == null) return new Node(val); 

        if(val > node.val){
            node.right = insert(node.right, val);
        } else {
            node.left = insert(node.left, val); 
        }
        return node; 
    }

    public static Node find(Node node, int val) {
        if (node == null) return null;
        if (node.val == val) return node;
        return (val < node.val) ? find(node.left, val) : find(node.right, val);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }

        LowestCommonAncestor obj = new LowestCommonAncestor(); 

        Node p = find(root, 20);
        Node q = find(root, 40);

        Node lcs = obj.lowestCommonAncestor(root, p, q); 

        System.out.println(lcs.val);
    }
}