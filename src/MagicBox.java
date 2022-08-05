import java.util.Random;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 05.08.2022
 */
public class MagicBox<T> {
    private final T[] items;
    private int count = 0;

    public MagicBox(int length) {
        items = (T[]) new Object[length];
    }

    boolean add(T item) {
        if (count == items.length) {
            return false;
        }
        items[count] = item;
        count++;
        return true;
    }

    T pick() {
        for (T item : items) {
            if (item == null) {
                throw new RuntimeException("Коробка не заполнена!\n Осталось заполнить еще " + (items.length - count) + " шт. " +
                        "Нужно больше золота :D");
            }
        }
        return items[new Random().nextInt(items.length)];
    }
}
