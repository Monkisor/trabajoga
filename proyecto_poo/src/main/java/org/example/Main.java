package org.example;

// Shift을(를) 두 번 눌러 Search Everywhere 대화상자를 열고 `show whitespaces`를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main {
    public static void main(String[] args) {
        // 캐럿을 하이라이트된 텍스트에 놓고 Alt+Intro을(를) 누르면
        // IntelliJ IDEA의 수정 제안을 볼 수 있습니다.
        System.out.printf("Hello and welcome!");

        // Mayús+F10을(를) 누르거나 여백의 녹색 화살표 버튼을 눌러 코드를 실행하세요.
        for (int i = 1; i <= 5; i++) {

            // Mayús+F9을(를) 눌러 코드 디버깅을 시작하세요. 중단점을 하나 설정해 드렸습니다.
            // 언제든 Ctrl+F8을(를) 눌러 중단점을 더 추가할 수 있습니다.
            System.out.println("i = " + i);
        }
    }
}