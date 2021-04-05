// import java.util.*;

// class Solution {
//     public int[] solution(int[] answers) {
//         int[] answer = {};
//         int[] person1 = {1,2,3,4,5}; //이만큼씩 반복
//         int[] person2 = {2,1,2,3,2,4,2,5};
//         int[] person3 = {3,3,1,1,2,2,4,4,5,5};
//         int ans1 = 0;
//         int ans2 = 0;
//         int ans3 = 0;
//         for(int i=0;i<answers.length;i++){
//           if(person1[i%person1.length]==answers[i]) ans1++;
//           if(person2[i%person2.length]==answers[i]) ans2++;
//           if(person3[i%person3.length]==answers[i]) ans3++;

//         }
//         int max = Math.max(Math.max(ans1, ans2), ans3);
//         ArrayList<Integer> list = new ArrayList<>();
        
//         if(max==ans1) list.add(1);
//         if(max==ans2) list.add(2);
//         if(max==ans3) list.add(3);
//         answer = new int[list.size()];
//         for(int i=0;i<list.size();i++){
//           answer[i] = list.get(i);
//         }
//         return answer;
//     }
// }


// class Main {
//   public static void main(String[] args) {
//     int[] answers = {1,2,3,4,5};
//     Solution sol = new Solution();
//     int[] answer = sol.solution(answers);
  
//     for(int i=0;i<answer.length;i++){
//       System.out.println(answer[i]);
//     }
//   }
// }