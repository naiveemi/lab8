package apps.a;

import util.Util;

import java.util.*;

public class JavaPerms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers >>>");
        String s = in.nextLine();
        System.out.print("all permutations:: ");
        System.out.println(listPermutations(Util.convertListStringToIntegerList(Util.convertStringToList(s))));
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
}
