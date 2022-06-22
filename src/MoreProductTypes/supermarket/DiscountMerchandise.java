package MoreProductTypes.supermarket;


import java.util.Date;

    public class DiscountMerchandise extends MerchandiseV2 implements ExpireDateMerchandise, VirtualMerchandise {
        private Date produceDate;
        private Date expirationDate;
    public DiscountMerchandise(String name, String id, int count, double soldPrice, double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice);
        this.produceDate = produceDate;
        this.expirationDate = expirationDate;
    }

    public void Discount (int count, double a){
        if (actualValueNow1(a)==1){
            super.buy(count,0.5);
        }else if (actualValueNow1(a)==0.7){
            System.out.println("商品单价为：" + soldPrice+"元，" +"您需购买"+count+"个。");
            System.out.println("本商品保质期已过一半，现在七折开卖!");
            super.buy(count, 0.7);
        }else {
            System.out.println("商品单价为：" + soldPrice+"元，" +"您需购买"+count+"个。");
            System.out.println("本商品保质期已过百分之九十了，现在五折开卖!");
            super.buy(count, 0.9);
        }
    }


    public Date getProducedDate() {
        return produceDate;
    }

    public Date getExpireDate() {
        return expirationDate;
    }

}
