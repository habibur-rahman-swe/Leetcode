// Last updated: 10/20/2025, 11:40:54 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    List<List<Integer>> finalList;

    public String smallestFromLeaf(TreeNode root) {
        finalList = new ArrayList<>();
        getAllList(root, new ArrayList<>());

        Collections.sort(finalList, (list1, list2) -> {
            int minSize = Math.min(list1.size(), list2.size());
            for (int i = 0; i < minSize; i++) {
                if (list1.get(i) < list2.get(i)) {
                    return -1;
                } else if (list1.get(i) > list2.get(i)) {
                    return 1;
                }
            }
            return list1.size() > list2.size() ? 1 : -1;
        });

        StringBuilder res = new StringBuilder("");

        for (int x : finalList.get(0)) {
            res.append((char)(x + 'a'));
        }

        return new String(res);
    }

    public void getAllList(TreeNode root, List<Integer> list) {
        list.add(root.val);
        if (root.left != null) getAllList(root.left, list);
        if (root.right != null) getAllList(root.right, list);

        if (root.left == null && root.right == null) {
            List<Integer> new_list = new ArrayList(list);
            Collections.reverse(new_list);
            finalList.add(new_list);
        }

        list.remove(list.size() - 1);
    }
}
