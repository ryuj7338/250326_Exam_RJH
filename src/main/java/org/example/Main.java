package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 빈칸 출력
        for (int i = 0; i < n; i++) {       // i가 n까지 반복
            for (int j = 0; j < i; j++) {   // j가 i까지 빈칸 출력
                System.out.print(" ");
            }

            for (int k = n - i; k > 0 ; k--) {  // k가 입력된 정수에서 i를빼고, k가 0까지 감소 반복
                System.out.print(k + " ");  // 입력된 정수부터 감소시킨걸 출력하기 위해 k + " "출력
            }
            System.out.println();   // 역 피라미드로 나타내기 위해 줄바꿈 출력
        }
    }
}