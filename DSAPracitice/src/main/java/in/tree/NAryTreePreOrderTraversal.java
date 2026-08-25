package in.tree;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreOrderTraversal {
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        preOrder(root);
        return ans;
    }
    public void preOrder(Node root){
        if(root==null) return;
        ans.add(root.val);
        for(int i=0;i<root.children.size();i++){
            preOrder(root.children.get(i));
        }
    }
}
