class Solution:
    def maxDistance(self, grid: List[List[int]]) -> int:
        x=len(grid)
        y=len(grid[0])
        # print(grid)
        max=0
        grid2=[[-1]*y for _ in range(x)]
        for i in range(x):
            for j in range(y):
                if(grid[i][j]==1):
                    grid2[i][j]=0
                else:
                    if((i-1)>=0 and grid2[i-1][j]!=-1):
                        if(grid2[i][j]==-1):
                            grid2[i][j]=grid2[i-1][j]+1
                        else:
                            grid2[i][j]=min(grid2[i][j],grid2[i-1][j]+1)
                    if((j-1)>=0 and grid2[i][j-1]!=-1):
                        if(grid2[i][j]==-1):
                            grid2[i][j]=grid2[i][j-1]+1
                        else:
                            grid2[i][j]=min(grid2[i][j],grid2[i][j-1]+1)
               
        for i in range(x-1,-1,-1):
            for j in range(y-1,-1,-1):
                if(grid[i][j]==1):
                    grid2[i][j]=0
                else:
                    if((i+1)<x and grid2[i+1][j]!=-1):
                        if(grid2[i][j]==-1):
                            grid2[i][j]=grid2[i+1][j]+1
                        else:
                            grid2[i][j]=min(grid2[i][j],grid2[i+1][j]+1)
                    if((j+1)<y and grid2[i][j+1]!=-1):
                        if(grid2[i][j]==-1):
                            grid2[i][j]=grid2[i][j+1]+1
                        else:
                            grid2[i][j]=min(grid2[i][j],grid2[i][j+1]+1)
        
        for i in range(x-1,-1,-1):
            for j in range(y-1,-1,-1):      
                if(max<grid2[i][j]):
                    max=grid2[i][j]
        if(max==0):
            return -1
        return max
