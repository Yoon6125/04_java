package com.java.lotto;

import java.util.HashSet;
import java.util.Scanner;

public class Lotto_run {
	void run() {
//		int x[] = {};
		System.out.println("로또 프로그램");

		int r[] = { 0, 0, 0, 0, 0, 0 };

		r[0] = (int) (Math.random() * 45 + 1);
		// 중복 제거
		while (true) {
			// 뽑기 처리
			r[1] = (int) (Math.random() * 45 + 1);
			if (r[1] != r[0]) {
				break;
			}

		}
		while (true) {
			// 뽑기 처리
			r[2] = (int) (Math.random() * 45 + 1);
			if (r[2] != r[0]) {
				break;
			}

		}
		while (true) {
			// 뽑기 처리
			r[3] = (int) (Math.random() * 45 + 1);
			if (r[3] != r[0]) {
				break;
			}

		}
		while (true) {
			// 뽑기 처리
			r[4] = (int) (Math.random() * 45 + 1);
			if (r[4] != r[0]) {
				break;
			}

		}
		while (true) {
			// 뽑기 처리
			r[5] = (int) (Math.random() * 45 + 1);
			if (r[5] != r[0]) {
				break;
			}

		}

//		r[2] = (int) (Math.random() * 45 + 1);
//		r[3] = (int) (Math.random() * 45 + 1);
//		r[4] = (int) (Math.random() * 45 + 1);
//		r[5] = (int) (Math.random() * 45 + 1);

		int[] p = new int[6];

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> enteredNumber = new HashSet<>();
		for (int i = 0; i < 6; i++) {
			System.out.println("번호를 입력하세요");
			p[i] = sc.nextInt();

			if (enteredNumber.contains(p[i])) {
				System.out.println("중복 수가 감지되었습니다.");
				i--;

			} else if (p[i] > 45) {
				System.out.println("45 이내의 수여야 합니다.");
				i--;
				continue;
			} else if (p[i] <= 0) {
				System.out.println("수를 다시 입력하세요");
				i--;
				continue;
			}else {
				enteredNumber.add(p[i]);
			}

		}

		System.out.print("유저 추첨번호:");
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
		System.out.println();
		System.out.print("추첨 번호:");

		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
		int count = 0;

		for (int e = 0; e < 6; e++) {
			for (int y = 0; y < 6; y++) {
				if (r[e] == p[y]) {
					count = count + 1;
				}
			}
		}
		System.out.println();
		System.out.println("맟춘 개수:" + count);

	}

}
