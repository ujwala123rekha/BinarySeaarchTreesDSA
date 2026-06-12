public TreeNode searchBST(TreeNode root, int target){

    while(root != null){

        if(root.val == target)
            return root;

        if(target > root.val)
            root = root.right;
        else
            root = root.left;
    }

    return null;
}
