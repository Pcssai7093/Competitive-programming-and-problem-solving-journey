
class Solution:
   
       
    def canReach(self, arr: List[int], start: int) -> bool:
        size=len(arr)
        # return self.btr(start,size,arr)
        visited=[False]*size
        q=[start]
        while(len(q)!=0):
            elem=q.pop()
            visited[elem]=True
            if(arr[elem]==0):
                return True
            r=elem+arr[elem]
            if(r<size and r>=0 and visited[r]==False):
                q.append(r)
                
            l=elem-arr[elem]
            if(l<size and l>=0 and visited[l]==False):
                q.append(l)
        return False
