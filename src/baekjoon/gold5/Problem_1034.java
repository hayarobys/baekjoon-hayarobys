package baekjoon.gold5;

import java.util.Scanner;

// 램프 https://www.acmicpc.net/problem/1034
/*
	문제
	지민이는 각 칸마다 (1*1크기의 정사각형) 램프가 들어있는 직사각형 모양의 탁자를 샀다.
	모든 램프는 켜져있거나 꺼져있다. 각 열의 아래에는 스위치가 하나씩 달려있는데,
	이 스위치를 누를 때마다 그 열에 있는 램프의 상태가 바뀐다.
	(켜져있는 램프는 꺼지고, 꺼져있는 램프는 켜진다)
	
	만약 어떤 행에 있는 램프가 모두 켜져있을 때, 그 행이 켜져있다고 말한다.
	지민이는 스위치를 K번 누를 것이다. 서로다른 스위치 K개를 누르지 않아도 된다.
	지민이는 스위치를 K번 눌러서 켜져있는 행을 최대로 하려고 한다.
	
	지민이의 탁자에 있는 램프의 상태와 K가 주어졌을 때,
	스위치를 K번 누른 후에 켜져있는 행의 최댓값을 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 N과 M이 주어진다. N은 행의 개수이고, M은 열의 개수이다.
	N과 M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 램프의 상태가 주어진다.
	1이 켜져있는 상태이고, 0이 꺼져있는 상태이다. 마지막 줄에는 K가 주어진다.
	K는 1,000보다 작거나 같은 자연수 또는 0이다.
	
	출력
	첫째 줄에 문제의 정답을 출력한다.
	
	알고리즘 분류
	브루트포스 알고리즘
 */
class Problem_1034 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] inputArray = sc.nextLine().split(" ");
			int n = Integer.parseInt(inputArray[0]); // 행의 개수
			int m = Integer.parseInt(inputArray[1]); // 열의 개수
			
			int[][] table = new int[m][n];
			for(int line=0; line<n; line++){
				String lampStatus = sc.nextLine(); // 0또는 1이 m개만큼 붙어 들어옴
				for(int row=0; row<lampStatus.length(); row++){
					table[row][line] = Integer.parseInt(lampStatus.substring(row, row+1));
				};
			}
			
			int k = Integer.parseInt(sc.nextLine()); // 스위치를 누른 횟수
			
			for(int line=0; line<table[0].length; line++){
				for(int row=0; row<table.length; row++){
					System.out.print(table[row][line] + "\t");
				}
				System.out.println();
			}
			System.out.println("k="+k);
			
			for(int count=0; count<k; count++){
				
			}
		}
	}
}