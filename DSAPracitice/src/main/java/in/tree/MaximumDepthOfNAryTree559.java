package in.tree;

import java.util.List;

public class MaximumDepthOfNAryTree559 {
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
}
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int depth =0;
        for(int i=0;i<root.children.size();i++){
            int ans = maxDepth(root.children.get(i));
            depth = Math.max(depth, ans);
        }
        return 1+ depth;
    }
}
