// #파일명정렬
// import java.util.*;

//     class Solution {
//     	public String[] solution(String[] files) {
//           //comparator 객체 사용하여 정렬기준 정의
//     		Arrays.sort(files, new Comparator<String>() {
// 			@Override
//       //compare 메소드 기준으로 정렬됨
// 			public int compare(String s1, String s2) {
//         String[] file1 = detach(s1);//헤더,중간,끝 으로 잘린 s1파일명
// 				String[] file2 = detach(s2);

				
// 				int headValue = file1[0].compareTo(file2[0]);//두문자열을 비교하여 int반환하는 메소드
				
//         //헤더가 같을때 number의 크기로 순위결정
// 				if(headValue == 0) {
//           //number비교
// 					int num1 = Integer.parseInt(file1[1]);//String -> int
// 					int num2 = Integer.parseInt(file2[1]);
					
// 					return num1 - num2;//
// 				} else {
// 					return headValue;//file1이 더 선행이면 양수 file2가 더 선행이면 음수
// 				}
// 			}
			
//       //str -> [head,number,tail]
// 			private String[] detach(String str) {
// 				String head = "";
// 				String number = "";
// 				String tail = "";

// 				int idx = 0;
// 				for( ; idx < str.length() ; ++idx) {
// 					char ch = str.charAt(idx);
// 					if(ch >= '0' && ch <= '9') break;
// 					head += ch;//숫자가 아닐때 까지만 head에 포함
// 				}
				
// 				for( ; idx < str.length() ; ++idx) {
// 					char ch = str.charAt(idx);
// 					if(!(ch >= '0' && ch <= '9')) break;
// 					number += ch;//숫자를 벗어나기 전까지 number에 포함
// 				}
				
// 				for( ; idx < str.length() ; ++idx) {
// 					char ch = str.charAt(idx);
// 					tail += ch;
// 				}
				
// 				String[] file = {head.toLowerCase(), number, tail};
				
// 				return file;
// 			}
// 		});
// 		return files;
// 	}
// }


// class Main {
//   public static void main(String[] args) {
//     String[] files =  {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"}; 
//     Solution sol = new Solution();
//     for(int i=0;i<sol.solution(files).length;i++){
//       System.out.print(sol.solution(files)[i]);
//     }
//   }
// }