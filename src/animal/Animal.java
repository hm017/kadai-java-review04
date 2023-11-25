package animal;

public class Animal {
    private String name; // 名前
    private int age;     // 年齢

    // 引数なしのコンストラクタ
    public Animal() {
    }

    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。"); // ○○です。△△歳です。
    }

}
