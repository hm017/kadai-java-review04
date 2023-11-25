package animal;

public class Review04 {

    public static void main(String[] args) {
        // 田中さん　引数(名前, 年齢, 趣味)
        Human tanaka = new Human("田中 太郎", 25, "電車");

        tanaka.say(); // ○○です。△△歳です。
        tanaka.think(); // 私は□□について考えています。

        // 鈴木さん　引数(名前, 年齢, 趣味)
        Human suzuki = new Human("鈴木 次郎", 30, "野球");

        suzuki.say(); // ○○です。△△歳です。
        suzuki.think(); // 私は□□について考えています。

        // 佐藤さん 引数(名前, 年齢, 趣味)
        Human sato = new Human("佐藤 花子", 20, "映画");

        sato.say(); // ○○です。△△歳です。
        sato.think(); // 私は□□について考えています。

    }

}
