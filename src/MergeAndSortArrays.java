import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Foydalanuvchidan ma'lumotlarni kiritish
        System.out.print("a[] massivi uzunligini kiriting (n): ");
        int n = scanner.nextInt();

        System.out.print("b[] massivi uzunligini kiriting (m): ");
        int m = scanner.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        System.out.println("a[] massivining elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        System.out.println("b[] massivining elementlarini kiriting:");
        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }

        // Funksiyani chaqirish
        ArrayList<ArrayList<Integer>> result = mergeAndSort(n, m, a, b);

        // Natijani ekranga chiqarish
        System.out.println("Yangi a: " + result.get(0));
        System.out.println("Yangi b: " + result.get(1));

        scanner.close();
    }

    public static ArrayList<ArrayList<Integer>> mergeAndSort(int n, int m, ArrayList<Integer> a, ArrayList<Integer> b) {
        // Ikkala massivni birlashtirish va tartiblash
        ArrayList<Integer> combined = new ArrayList<>(a);
        combined.addAll(b);
        Collections.sort(combined);

        // Eng kichik n ta elementni a massiviga, qolganlarini b massiviga joylashtirish
        ArrayList<Integer> newA = new ArrayList<>(combined.subList(0, n));
        ArrayList<Integer> newB = new ArrayList<>(combined.subList(n, combined.size()));

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(newA);
        result.add(newB);

        return result;
    }
}
