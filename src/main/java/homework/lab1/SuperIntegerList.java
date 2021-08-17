package homework.lab1;

/**
 * @author Evgeny Borisov
 */
public interface SuperIntegerList {

    //int getCup();
    //int getLength();

    void add(int number);

    void removeByIndex(int index);

    void removeByValue(int value);

    int get(int index);

    void printAll();
}
