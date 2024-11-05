import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();

        // Tìm giá trị lớn nhất
        int maxValue = (a > b) ? a : b;
        System.out.println("Giá trị lớn nhất là: " + maxValue);

        // Tìm giá trị nhỏ nhất
        int minValue = (a < b) ? a : b;
        System.out.println("Giá trị nhỏ nhất là: " + minValue);
    }
}
