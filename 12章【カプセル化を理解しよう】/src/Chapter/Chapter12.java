package Chapter;

public class Chapter12 {
    public static void main(String[] args) {
        CapsuleMan man = new CapsuleMan("小林", 32);
        System.out.println("名前は" + man.getname() +  "です。");
        System.out.println("年齢は" + man.getage() + "です。");
        man.setage(33);
        System.out.println("誕生日を迎えたので、年齢が" + man.getage() + "になりました。");
    }
}