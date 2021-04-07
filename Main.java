class Solution {
    public int solution(int n, int[][] computers) {
      int answer = 0;
      boolean[] check = new boolean[n];//n개수만큼 boolean배열을 만듬
      
      for(int i=0;i<n;i++){
        if(check[i]!=true){
          dfs(computers,j,check);
          answer++;
        }
      }

      return answer;

  }

  boolean[] dfs(int[][] computers, int i, boolean[] check){
    check[i]=true;
    
    for(int j=0;j<n;j++){
      if(i!=j && computers[i][j]==1 && check[j]==false){
        dfs(computers,j,check);
      }
    }
    return check;
  }
  @Test
  public void 정답() {
    Assert.assertEquals(2, solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    Assert.assertEquals(1, solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
  }

}

