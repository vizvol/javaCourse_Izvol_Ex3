public class Array {

    public static void main(String[] args) {

        //Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.
        int [] array = {3, 22, 1, 13, 4, 6, 16, 5};

        // Печать всех элементов
        System.out.print("Исходный массив: ");
        for (int element : array ) {
                System.out.print(element + " ");
        };
        System.out.println();

        //1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.
        System.out.print("\n1. Чётные числа массива: ");
        for (int element : array ) {
            if (element % 2 == 0)
                System.out.print(element + " ");
            else continue;
        };

        //2.Напишите программу, которая выводит все двузначные числа массива.
        System.out.print("\n2. Двузначные числа массива: ");
        for (int element : array ) {
            if (element > 9 && element < 100)
                System.out.print(element + " ");
        };

        //3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.
        System.out.print("\n3. Наибольшее целое число массива: ");
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > maxNumber )
                maxNumber = array[i];
        System.out.print(maxNumber);

        //4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.
        System.out.print("\n4. Сумма элементов массива: ");
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        System.out.print(sum);

        //5.***Напишите программу, которая переворачивает массив в обратном порядке.
        System.out.print("\n5. Массив в обратном порядке: ");
        int x = 0;
        int [] arrayRevers = new int[array.length];
        for (int j = array.length - 1; j >= 0; j--) {
            arrayRevers[x] = array[j];
            System.out.print(arrayRevers[x] + " ");
            x++;
        }

        System.out.println();
    }
}
