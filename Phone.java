package phone;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Phone {
    private int no;
    private String brand;
    private double runMemory;
    private double price;
    private int battery;

    public Phone(){

    }

    public Phone(int no, String brand, double runMemory,
                 double price, int battery) {
        this.no = no;
        this.brand = brand;
        this.runMemory = runMemory;
        this.price = price;
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRunMemory() {
        return runMemory;
    }

    public void setRunMemory(double runMemory) {
        this.runMemory = runMemory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String[] brand5 = {"Apple", "Huawei", "Samsung", "Xiaomi", "OPPO"};

    public void call(){
        battery=Math.max(0,battery-2);
        System.out.println(brand+"手机正在打电话");
    }
    public void sendMessage(){
        battery=Math.max(0,battery-1);
        System.out.println(brand+"手机正在发短信");
    }
    public void takePhoto(){
        battery=Math.max(0,battery-4);
        System.out.println(brand+"手机正在拍照");
    }

    @Override
    public String toString() {
        return "编号为" +brand+no+"的手机参数\n"+
                "品牌：" + brand +"\n"+
                "运行内存" + runMemory +"\n"+
                "价格：" + price +"\n"+
                "电量：" + battery +"\n"+
                "---------------------------\n";
    }
}
