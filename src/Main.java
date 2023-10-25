import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj ilosc liczb zawartych w tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int SIZE = scanner.nextInt();
        System.out.println("Podaj wartosc minimalna");
        int min = scanner.nextInt();
        System.out.println("Podaj wartosc maksymalna");
        int max = scanner.nextInt();
        double[] array = fillArray(SIZE,min,max);
        System.out.println(" ");
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print((array)[i]+", ");
        }
    }
    public static void insertionSort(double[] doublearray) {
        double temp;
        int n = doublearray.length;
        for (int i = 1; i < n; i++) {
            temp = doublearray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (doublearray[j] > temp) {
                    doublearray[j + 1] = doublearray[j];
                    doublearray[j] = temp;
                }
            }
        }}

    public static double randDouble(double min, double max) {


        Random rand = new Random();

        double randomNum = rand.nextDouble((max - min) + 1) + min;
        return (double) Math.round(randomNum * 100) / 100;


    }
    public static double[] fillArray(int SIZE,int min,int max) {
        double array[] = new double[SIZE];
        System.out.println("Generowanie tablicy...");
        for (int i = 0; i < SIZE; i++) {
            array[i] = randDouble(min, max);
            System.out.print(array[i] + ", ");
        }
        return array;
    }}
