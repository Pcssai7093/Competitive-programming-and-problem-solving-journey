class Solution {
    static int maxIndex=0;static int nodeCnt=0;
    
    void isComplete(Node tree,int index){
        if(tree==null)
            return ;
        else{
            nodeCnt++;
            if(index>maxIndex)
                maxIndex=index;
        }
        
        int left=2*index+1,right=2*index+2;
        isComplete(tree.left,left);
        isComplete(tree.right,right);
    }
    
    boolean isHeaphelper(Node tree) {
        // code here
        if(tree==null)
        return true;
        
        boolean status=true;
        if(tree.left!=null&&tree.left.data>tree.data)
        status=false;
        
        if(tree.right!=null&&tree.right.data>tree.data)
        status=false;
        
        return (status&&isHeaphelper(tree.left)&&isHeaphelper(tree.right));
    }
    boolean isHeap(Node tree){
        nodeCnt=0;
        maxIndex=0;
        isComplete(tree,0);
        
        if((nodeCnt-1)==maxIndex&&(isHeaphelper(tree)==true))
        return true;
        
        return false;
    }
}
