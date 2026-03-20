package phone;

import java.util.Random;

public class Test {
    public static void main(String[] args){
        Phone[] phones=new Phone[5];
        Random random=new Random();

        for (int i=0;i< phones.length;i++) {
            int[] selectBrand=new int[phones.length];
            phones[i] = new Phone();
            selectBrand[i] = random.nextInt(4);
            switch (selectBrand[i]) {
                case 0:
                    phones[i].setBrand("Apple");
                    break;
                case 1:
                    phones[i].setBrand("Huawei");
                    break;
                case 2:
                    phones[i].setBrand("Xiaomi");
                    break;
                case 3:
                    phones[i].setBrand("Samsung");
                    break;
                case 4:
                    phones[i].setBrand("OPPO");
                    break;
            }
            phones[i].setBattery(random.nextInt(40,101));
            phones[i].setNo(random.nextInt(10000,100000));
            phones[i].setPrice(random.nextInt(4000,6001));
            phones[i].setRunMemory(512.0);
            System.out.println(phones[i]);
        }

        for (Phone phone:phones){
            int o1,o2;
            System.out.println("---正在为编号为"+phone.getBrand()+phone.getNo()+"的手机执行操作---");
            do {
                o1= random.nextInt(3);
                o2= random.nextInt(3);
            }while (o1==o2);
            switch (o1){
                case 0:phone.call();break;
                case 1:phone.sendMessage();break;
                case 2:phone.takePhoto();break;
            }
            switch (o2){
                case 0:phone.call();break;
                case 1:phone.sendMessage();break;
                case 2:phone.takePhoto();break;
            }
            System.out.println("-------------------------------------------------------------");
            System.out.println();
            System.out.println();
        }

        for (int i=0;i< phones.length;i++){
            System.out.println(phones[i]);
        }

    }
}
