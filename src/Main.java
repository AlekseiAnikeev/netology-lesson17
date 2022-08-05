/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 05.08.2022
 */
public class Main {
    public static void main(String[] args) {
        int length = 5;
        MagicBox<String> mb = new MagicBox<>(length);
        //заполняем
        for (int i = 1; i < length + 2; i++) {
            if (mb.add("Строка " + i)) {
                System.out.println("Добавлено");
            } else {
                System.out.println("Лимит добавления");
            }
        }
        //проверяем случайный вывод
        for (int i = 0; i < 5; i++) {
            System.out.println(mb.pick());
        }
        // ошибаемся :)
        MagicBox<Integer> magicBox = new MagicBox<>(4);
        for (int i = 0; i < 4; i++) {
            magicBox.add(i);
            if (i == 2) {
                magicBox.pick();
            }
        }
    }
}
