package ch01_variable_type;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2;
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0;

        System.out.println("//////////////");

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

    }
}
