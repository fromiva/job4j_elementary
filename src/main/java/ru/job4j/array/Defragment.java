package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int indexLeft = 0; indexLeft < array.length; indexLeft++) {
            if (array[indexLeft] == null) {
                for (int indexRight = indexLeft + 1; indexRight < array.length; indexRight++) {
                    if (array[indexRight] != null) {
                        array[indexLeft] = array[indexRight];
                        array[indexRight] = null;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String element : compressed) {
            System.out.print(element + " ");
        }
    }
}
