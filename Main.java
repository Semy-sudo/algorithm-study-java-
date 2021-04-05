import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0;i<commands.length;i++){
          int[] new_array = new int[commands[i][1]-commands[i][0]+1];
          for(int j=0;j<new_array.length;j++){
            new_array[j] = array[j+commands[i][0]-1];
          }
          Arrays.sort(new_array);
          answer[i] = new_array[commands[i][2]-1];
        }

        return answer;
    }
}

class Main {
  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    Solution sol = new Solution();
    int[] answer = sol.solution(array, commands);
    for(int i:answer){
      System.out.println(i);
    }

  }
}

