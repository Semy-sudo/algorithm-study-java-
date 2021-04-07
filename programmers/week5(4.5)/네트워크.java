// class Solution {
//     public int solution(int n, int[][] computers) {
//       int answer = 0;
//       boolean[] check = new boolean[n];//n개수만큼 boolean배열을 만듬
      
//       for(int i=0;i<n;i++){
//         if(check[i]!=true){
//           dfs(computers,i,check);
//           answer++;
//         }
//       }

//       return answer;

//   }

//   boolean[] dfs(int[][] computers, int i, boolean[] check){
//     check[i]=true;
    
//     for(int j=0;j<computers.length;j++){
//       if(i!=j && computers[i][j]==1 && check[j]==false){
//         dfs(computers,j,check);
//       }
//     }
//     return check;
//   }
// }