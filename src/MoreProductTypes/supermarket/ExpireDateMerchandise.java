package MoreProductTypes.supermarket;

import java.util.Date;

public interface ExpireDateMerchandise {

    // 缺省的实现方法，用default修饰，可以有方法体
    default boolean notExpireInDays(int days) {
        return daysBeforeExpire() > days;
    }

    Date getProducedDate();

    Date getExpireDate();

    default double leftDatePercentage(double a) {
        return 1.0 * (daysBeforeExpire() *a)/ (daysBeforeExpire() + daysAfterProduce());
    }
    // actualValueNow();
    //在不同保质期阶段内商品的售价不同
    default double actualValueNow1(double a){
        if (leftDatePercentage(a )>0.0 && leftDatePercentage(a)<=0.5)
            return 1;
        else if (leftDatePercentage(a)>0.5 && leftDatePercentage(a)<0.9)
            return 0.7;
        else
            return 0.5;
    };

    //这俩个方法是私有的，只是实现类中计算
    private long daysBeforeExpire() {
        long expireMS = getExpireDate().getTime();
        long left = expireMS - System.currentTimeMillis();
        if (left < 0) {
            return -1;
        }
        return left / (24 * 3600 * 1000);
    }

    private long daysAfterProduce() {
        long produceMS = getProducedDate().getTime();
        long left = System.currentTimeMillis() - produceMS;
        if (left < 0) {
            return -1;
        }
        return left / (24 * 3600 * 1000);
    }

}
