package MoreProductTypes;


import MoreProductTypes.supermarket.*;

import java.util.Date;

public class UseInterface {

    public static void main(String[] args) {

        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        DiscountMerchandise discountMerchandise =new DiscountMerchandise
                ("面包","面包001",100,10,5,
                        produceDate, expireDate);
        ExpireDateMerchandise am= discountMerchandise;
       // System.out.println(am.notExpireInDays(366));
        //由于没有学会怎样获取以前时间，因此，使用参数代替百分比。
        //System.out.println(am.leftDatePercentage(0.7));
        DiscountMerchandise a =(DiscountMerchandise) am;
        //System.out.println(a.actualValueNow1(0.4));
        a.Discount(200,0.3);



    }
}
