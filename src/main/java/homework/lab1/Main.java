package homework.lab1;

public class Main {
    public static void main(String[] args) {
        SuperIntegerList superIntegerList = new TimSuperIntegerList(new int[]{1, 2, 3});

        superIntegerList.printAll(); // should be 1 2 3

        superIntegerList.removeByIndex(1);
        superIntegerList.add(5);
        superIntegerList.add(6);
        superIntegerList.printAll(); // should be 1 3 5 6

        superIntegerList.removeByValue(6);
        superIntegerList.printAll(); // should be 1 3 5


        superIntegerList.removeByIndex(1);
        superIntegerList.removeByIndex(0);
        System.out.println(superIntegerList.get(0)); // should be 5

        superIntegerList.removeByIndex(-5); // should not terminate

        superIntegerList.get(10); // should not terminate

    }
}