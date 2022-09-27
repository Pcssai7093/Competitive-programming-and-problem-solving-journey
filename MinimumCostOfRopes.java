class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        Queue<Long> pq=new PriorityQueue<>();
        long cost=0;
        for(int i=0;i<n;i++)
        pq.add(arr[i]);
        
        while(pq.size()>1){
            long item1=pq.poll();
            long item2=pq.poll();
            cost+=(item1+item2);
            pq.add(item1+item2);
        }
            // System.out.println(cost);
    // return pq.peek();
        return cost;
    }
}
