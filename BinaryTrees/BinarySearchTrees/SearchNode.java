public class SearchNode {

    public static boolean search(Node node, int k){
        if(node == null) return false; 

        if(node.val == k) return true; 

        if(k > node.val){
            return search(node.right, k);
        } else {
            return search(node.left, k);
        }
    }

    public static Node insert(Node node, int val){
        if(node == null) return new Node(val);

        if(val < node.val){
            node.left = insert(node.left, val); 
        } else if (val > node.val){
            node.right = insert(node.right, val); 
        }

        return node; 
    }
    public static void main(String[] args) {
        Node root = null; 
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }

        boolean found = search(root, 20);
        System.out.println(found);
    }
}
