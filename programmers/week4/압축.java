// import java.util.*;

// class Solution{
//   public int[] solution(String msg){
//     ArrayList<Integer> compress = new ArrayList<>();
//     HashMap<String,Integer> dic = new HashMap<>();

//     makedic(dic);

//     int dicidx = 27;
//     boolean isEnd = false;

//     for(int i=0;i<msg.length();i++){
//       String word = msg.charAt(i)+"";
      
//       while(dic.containsKey(word)){
//         //마지막 알파벳이라면
//         i++;
//         if(i==msg.length()){
//           isEnd = true;
//           break;
//         }
//         word +=msg.charAt(i);
//       }
//       if(isEnd){
//         compress.add(dic.get(word));
//         break;
//       }
      
//       compress.add(dic.get(word.substring(0,word.length()-1)));
//       //사전에 넣어주기
//       dic.put(word,dicidx++);
//       i--;
//     }

   

//     int[] answer = new int[compress.size()];//compress에 값을 옮겨오기 위해
//     for(int i=0; i<answer.length; i++){
//       answer[i] = compress.get(i);
//     }
//     return answer;
//   }
//   public void makedic(HashMap<String,Integer> map){
//     char ch = 'A';
//     for(int i=1;i<27;i++){
//       map.put(ch+"",i);
//       ch++;
//     }
    
    
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     String msg = "KAKAO";
//     Solution sol = new Solution();
//     for(int i=0;i<sol.solution(msg).length;i++){
//       System.out.print(sol.solution(msg)[i]);
//     }
//   }
// }