package Learning;

import Learning.supermarket.MerchandiseV2;
import Learning.supermarket.Phone;

public class UsePhoneExtendsMerchandise {
    public static void main(String[] args) {

        Phone ph = new Phone();
        Phone phone=new Phone();
        MerchandiseV2 m= phone;
        m.describe();
        MerchandiseV2 m2= new MerchandiseV2();
        System.out.println();
        m2.describe();

//

//        Phone phone = new Phone(
//            "手机001", "Phone001", 100, 1999, 999,
//            4.5, 3.5, 4, 128, "索尼", "安卓"
//        );
//
//        phone.describe();
//        System.out.println();
//
//        System.out.println(phone.getName());
//        System.out.println();
//
//        phone.buy(100);
//
//        phone.buy(3);

    }
}
