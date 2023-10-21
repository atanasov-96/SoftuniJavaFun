package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<String> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();
        List<String> remainders = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            for (int i = firstList.size() -1 ; i >= secondList.size(); i--) {
                remainders.add(firstList.get(i));
            }
        } else {
            for (int i = secondList.size() -1 ; i >= firstList.size(); i--) {
                remainders.add(secondList.get(i));
            }
        }
        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        Collections.reverse(remainders);

        result.addAll(remainders);

        System.out.println();
        for (String e : result) {
            System.out.print(e + " ");
        }
    }
}
