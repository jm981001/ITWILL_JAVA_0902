package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 트럼프 카드 구현을 위해 List 객체 사용
		 * - ArrayList 객체(cards)를 생성하여
		 *   기호 ♠, ◆, ♥, ♣ 와 숫자 2 ~ 9, 영문자 A, J, Q, K를 조합하여 카드 생성
		 * */
		
		String[] marks = {"♠", "◆", "♥", "♣"};
		String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
		
		List cards = new ArrayList();
		
		/*
		 * 반복문을 사용하여 숫자와 마크를 중첩으로 반복(총 52개의 트럼프 카드 생성)
		 * => 마크 + 숫자를 결합한 문자열을 ArrayList 객체(cards)에 추가
		 *    ex) "♠" 마크와 숫자 "2" 를 결합하여 "♠2" -> cards에 추가
		 * => 최종적으로 생성된 트럼프 카드 목록 (cards)을 출력
		 * */
		for(String mark : marks) {
			for(String number : numbers) {
				cards.add(mark + number); 
			}
		}
		
		System.out.println(cards);
		
		System.out.println("=======================");
		
		// 생성된 트럼프 카드를 무작위로 섞기
		Collections.shuffle(cards);
		System.out.println(cards);
		
		// 3명의 플레이어가 카드 5장을 가진다고 가정할때 String[] 배열 3개 생성
		String[] player1 = new String[5];
		String[] player2 = new String[5];
		String[] player3 = new String[5];
		
		// get() 메서드를 사용하여 카드를 전달하는 경우 = 카드가 제거되지 않고 전달됨
//		player1[0] = cards.get(0).toString();
//		System.out.println(player1[0]);
//		player2[0] = cards.get(1).toString();
//		System.out.println(player2[0]);
		
		// remove() 메서드 사용
//		player1[0] = cards.remove(0).toString();
//		player2[0] = cards.remove(0).toString();
//		player3[0] = cards.remove(0).toString();
//		player1[1] = cards.remove(0).toString();
//		player2[1] = cards.remove(0).toString();
//		player3[1] = cards.remove(0).toString();
// 		System.out.println(player1[0]);
// 		System.out.println(player2[0]);
// 		System.out.println(player3[0]);
// 		System.out.println(cards);
		
		for(int i = 0; i < player1.length; i++) {
			player1[i] = cards.remove(0).toString();
			player2[i] = cards.remove(0).toString();
			player3[i] = cards.remove(0).toString();
		}
		
		System.out.println("플레이어1의 카드 : " + Arrays.toString(player1));
		System.out.println("플레이어2의 카드 : " + Arrays.toString(player2));
		System.out.println("플레이어3의 카드 : " + Arrays.toString(player3));
		System.out.println("전달하고 남은 카드들: " + cards);
		System.out.println("전달하고 남은 카드수: " + cards.size());
		
		
	}

}
