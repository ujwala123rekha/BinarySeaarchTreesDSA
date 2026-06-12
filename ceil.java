public int ceilBST(TreeNode root, int target){

    int ceil = -1;

    while(root != null){

        if(root.val == target){
            return root.val;
        }

        if(target < root.val){
            ceil = root.val;
            root = root.left;
        }
        else{
            root = root.right;
        }
    }

    return ceil;
}
