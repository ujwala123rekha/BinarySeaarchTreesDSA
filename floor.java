public int floorBST(TreeNode root, int target){
    int floor = -1;
    while(root != null){
        if(root.val == target){
            return root.val;
        }
        if(target > root.val){
            floor = root.val;
            root = root.right;
        }
        else{
            root = root.left;
        }
    }
    return floor;
}
