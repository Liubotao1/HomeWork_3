package Interface;

import SubclassOverrideSuperProtected.supermarket.MerchandiseV2;

import java.util.Date;

public class UseInterface {
    public static void main(String[] args) {

        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard = new GamePointCard(
                "手机001", "Phone001", 100, 1999, 999,
                produceDate, expireDate
        );

        // phoneExtendsMerchandise.describe();


        // >> TODO 可以用实现接口的类的引用，给接口的引用赋值。
        //  >>TODO 类似于可以使用子类的引用给父类赋值
        ExpireDateMerchandise expireDateMerchandise = gamePointCard;
        //>>TODO 虽然接口不能new一个对象，但是可以通过实现接
        // >>TODO 口的类引用调用接口中的方法。
        expireDateMerchandise.getExpireDate();


        VirtualMerchandise virtual = gamePointCard;

        MerchandiseV2 m = gamePointCard;

        expireDateMerchandise = (ExpireDateMerchandise) m;

        virtual = (VirtualMerchandise) m;

        if(m instanceof ExpireDateMerchandise){
            System.out.println("m 是 ExpireDateMerchandise 类型的实例");
        }

        if(m instanceof VirtualMerchandise){
            System.out.println("m 是 VirtualMerchandise 类型的实例");
        }


    }
}
