package Chapter;

public interface Flying {

    // メソッド（抽象メソッド）
    void fly();

    void call(String number);

    // defaultメソッド
    default void powerOff() {
        System.out.println("飛んでいる場合は落下します。");
    }
}