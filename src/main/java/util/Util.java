package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив чисел >>>");
        String s = in.nextLine();
        System.out.print("Возможные перестановки чисел: ");
        System.out.println(listPermutations(convertListStringToIntegerList(convertStringToList(s))));
        }

    public static List<List<Integer>> listPermutations(List<Integer>list) {

        if (list.size() == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }

        List<List<Integer>> elements = new ArrayList<>();

        Integer firstElement = list.remove(0);

        List<List<Integer>> recursiveReturn = listPermutations(list);
        for (List<Integer> li : recursiveReturn) {

            for (int index = 0; index <= li.size(); index++) {
                List<Integer> temp = new ArrayList<>(li);
                temp.add(index, firstElement);
                elements.add(temp);
            }
        }
        return elements;
    }
    public static List<String> convertStringToList(String s) {
        try {
            return Arrays.asList(s.substring(1, s.length() - 1).split(", "));
        } catch (NumberFormatException e) {
            return Arrays.asList(s.substring(1, s.length() - 1).split(","));
        }
    }
    public static List<Integer> convertListStringToIntegerList(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for(String s : stringList) intList.add(Integer.valueOf(s));
        return  intList;
    }
}
