 int binSearch(int[] a,int n,int x){
        int s=0,e=n-1;
        while(s<e){
            int m=(s+e)/2;
            if(a[m]<x)
            s=m+1;
            else{
            e=m;
            }
        }
        if(a[s]==x)
        return s;
        return -1;
    }
