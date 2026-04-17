import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();    // (1) 위치의 숫자
        int j = sc.nextInt();    // (2) 위치의 숫자
        
        // (3)번 : (1) * (2)의 일의 자리
        int a = i * (j % 10);
        // (4)번 : (1) * (2)의 십의 자리
        int b = i * ((j / 10) % 10);
        // (5)번 : (1) * (2)의 백의 자리
        int c = i * (j / 100);
        // (6)번 : (1) * (2) 전체 결과
        int d = i * j;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);        
    }
}