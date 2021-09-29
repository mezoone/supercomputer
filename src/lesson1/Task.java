package lesson1;

import java.util.Scanner;

public class Task {
	public static void main(String[] msi) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = { 1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2 };
		int arr2[] = { 15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52 };
		int arr3[] = { 15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52 };

		System.out.print("Введите номер задания: ");
		int num = sc.nextInt();
		if (num == 1)
			one(sc);
		else if (num == 2)
			two(sc);
		else if (num == 3)
			three(sc);
		else if (num == 4)
			four(sc);
		else if (num == 5)
			five(sc);
		else if (num == 6)
			six(sc);
		else if (num == 7)
			seven(sc);
		else if (num == 8)
			eight(arr1);
		else if (num == 9)
			nine(arr2);
		else if (num == 10)
			ten(arr3);
	}

	public static void one(Scanner sc) {
		System.out.print("Задание 1\nведите число: ");
		System.out.print("Результат: " + sc.nextInt() % 10 + "\n");
	}

	public static void two(Scanner sc) {
		System.out.print("Задание 2\nведите число: ");
		int a = sc.nextInt();
		System.out.println("Результат: " + (a / 100 + a / 10 % 10 + a % 10));
	}

	public static void three(Scanner sc) {
		System.out.print("Задание 3\nведите число: ");
		int a = sc.nextInt();
		System.out.println("Результат: " + (a > 0 ? a + 1 : a));
	}

	public static void four(Scanner sc) {
		System.out.print("Задание 4\nведите число: ");
		int a = sc.nextInt();
		if (a > 0)
			a += 1;
		else if (a < 0)
			a -= 2;
		else
			a = 10;
		System.out.println("Результат: " + a);
	}

	public static void five(Scanner sc) {
		System.out.print("Задание 5\nведите три числа: ");
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		System.out.print("Минимумальное число: ");
		if (d <= e && d <= f)
			System.out.println(d);
		else if (e <= d && e <= f)
			System.out.println(e);
		else
			System.out.println(f);
	}

	public static void six(Scanner sc) {
		System.out.print("Задание 6\nведите число: ");
		int a = sc.nextInt();
		if (a == 0)
			System.out.println("Ноль");
		else if (a > 0 && a % 2 == 0)
			System.out.println("Положительное четное число");
		else if (a > 0 && a % 2 != 0)
			System.out.println("Положительное нечетное число");
		else if (a < 0 && a % 2 == 0)
			System.out.println("Отрицательное четное число");
		else if (a < 0 && a % 2 != 0)
			System.out.println("Отрицательное нечетное число");
	}

	public static void seven(Scanner sc) {
		System.out.print("Задание 7\nведите число: ");
		int r = sc.nextInt();
		if (r == 905)
			System.out.println("Москва. стоимость разговра: " + 4.15 * 10);
		else if (r == 194)
			System.out.println("Ростов. стоимость разговра: " + 1.98 * 10);
		else if (r == 491)
			System.out.println("Краснодар. стоимость разговра: " + 2.69 * 10);
		else if (r == 800)
			System.out.println("Киров. стоимость разговра: " + 5 * 10);
		else
			System.out.println("Город не найден");
	}

	public static void eight(int[] ar) {
		System.out.print("Задание 8\nМассив: ");
		for (int a : ar)
			System.out.print(a + " ");
		System.out.print("\n");

		int len = ar.length;
		int max = 0;
		int sumPos = 0;
		int evenNeg = 0;
		int countPos = 0;
		int sumNeg = 0;
		int countNeg = 0;
		int i = 0;

		while (i < len) {
			if (max < ar[i])
				max = ar[i];
			if (ar[i] < 0 && ar[i] % 2 == 0)
				evenNeg += ar[i];
			if (ar[i] >= 0) {
				sumPos += ar[i];
				countPos++;
			} else {
				sumNeg += ar[i];
				countNeg++;
			}
			i++;
		}
		if (countNeg == 0)
			countNeg = 1;
		System.out.println("Максимальное значение: " + max);
		System.out.println("Сумма положительных элементов: " + sumPos);
		System.out.println("Сумма четных отрицательных элементов: " + evenNeg);
		System.out.println("Количество положительных элементов: " + countPos);
		System.out.println("Среднее арифметическое отрицательных элементов" + sumNeg / countNeg);
	}

	public static void nine(int[] arr) {
		System.out.print("Задание 9\nМассив: ");
		for (int a : arr)
			System.out.print(a + " ");
		System.out.print("\n");

		int len = arr.length;
		int[] arr2 = new int[len];
		int i = 0;
		System.out.print("Результат: ");
		while (len > 0) {
			arr2[i] = arr[--len];
			System.out.print(arr2[i++] + " ");
		}
		System.out.print("\n");
	}

	public static void ten(int[] arr) {
		System.out.print("Задание 10\nМассив: ");
		for (int a : arr)
			System.out.print(a + " ");
		System.out.print("\n");

		int len = arr.length;
		int[] arr2 = new int[len];
		int i = 0;
		int z = 0;
		while (i < len) {
			if (arr[i] != 0)
				arr2[z++] = arr[i];
			i++;
		}
		while (z < len)
			arr2[z++] = 0;
		System.out.print("Результат: ");
		for (int a : arr2)
			System.out.print(a + " ");
		System.out.print("\n");
	}
}
