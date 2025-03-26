package org.example;



public class Main {
    public static void main(String[] args) {

       int num1 = 0;    // 0 출력하기 위해 필요하니까
       int num2 = 1;    // 1 출력하기 위해 필요하니까
       int num3;    // num3 빈 공간용


       for (int i = 0; i < 10; i++) {   // 정수 10개가 필요하니까 i가 0부터 10까지 반복

           System.out.print(num1+ " "); // num1값 출력


           num3 = num2;     // num3은 비어있기 때문에 num2 (=1) 을 저장
           num2 = num1 + num2;  // num2에 num1과 num2를 더한 값 저장
           num1 = num3;  // num1에 num3값 저장
       }

    }
}