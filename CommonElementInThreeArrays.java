class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        int p=0,q=0,r=0;
        ArrayList<Integer> l=new ArrayList<Integer>();
        while(p<n1&&q<n2&&r<n3){
            int e1=A[p],e2=B[q],e3=C[r];
            int max=e1>e2?((e1>e3)?e1:e3):((e2>e3)?e2:e3);
            
            if(A[p]<max)
            p++;
            
            if(B[q]<max)
            q++;
            
            if(C[r]<max)
            r++;
            
            if(p<n1&&q<n2&&r<n3)
            if(A[p]==B[q]&&B[q]==C[r]){
            l.add(A[p]);
                
            while(p<n1&&A[p]==max)
                p++;
            }
        }
    return l;}
}
