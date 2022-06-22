package Interface;

import SubclassOverrideSuperProtected.supermarket.MerchandiseV2;

import java.util.Date;

public class GamePointCard extends MerchandiseV2 implements ExpireDateMerchandise,VirtualMerchandise {

    private Date produceDate;
    private Date expirationDate;

    public GamePointCard(String name, String id, int count, double soldPrice, double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice);
        this.produceDate = produceDate;
        this.expirationDate = expirationDate;
    }

    // >> TODO 一个类实现接口，就是从接口继承了抽象方法
    public boolean notExpireInDays(int days) {
        return daysBeforeExpire() > days;
    }

    public boolean notExpireDay(int day) {
        return false;
    }

    public Date getProducedDate() {
        return produceDate;
    }

    public Date getExpireDate() {
        return expirationDate;
    }

    public double leftDatePercentage() {
        return 1.0 * daysBeforeExpire() / (daysBeforeExpire() + daysAfterProduce());
    }

    public double actualValueNow(double leftDatePercentage) {
        return soldPrice;
    }

    private long daysBeforeExpire() {
        long expireMS = expirationDate.getTime();
        long left = expireMS - System.currentTimeMillis();
        if (left < 0) {
            return -1;
        }
        // 返回值是long，是根据left的类型决定的
        return left / (24 * 3600 * 1000);
    }

    private long daysAfterProduce() {
        long expireMS = expirationDate.getTime();
        long left = System.currentTimeMillis() - expireMS;
        if (left < 0) {
            return -1;
        }
        // 返回值是long，是根据left的类型决定的
        return left / (24 * 3600 * 1000);
    }

}
