package animal;

public class Human extends Animal implements Thinkable {

    private String hobby;

    // 引数なしのコンストラクタ
    public Human() {
    }

    // 引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age); // スーパークラス(Animal)のコンストラクタを呼び出し
        this.hobby = hobby;
    }

    // メソッド
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");  // 私は□□について考えています。
    }

}
