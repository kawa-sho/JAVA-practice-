package Chapter.Car;

public class Car {
    // 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    // コンストラクタを作成
    public Car(double fuelCost, double fuelAmount) {
	    this.fuelCost = fuelCost;
	    this.fuelAmount = fuelAmount;
    }
    // moveメソッド
    public void move(int num) {
    	System.out.println( num + "km走ります");
    	this.fuelAmount -= (num / fuelCost);
    }
    // ・"xx km 走ります"を出力
    // ・残量を計算
    public double getFuelAmount() {
    	return this.fuelAmount;
    }
    // fuelAmountを取得するメソッドを作成
}