package SubclassOverrideSuperProtected.supermarket;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestVizSamePkgAppMain {



    public static void dyncArgs(int a ,String... args){

    }
    public static void main(String... args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        dyncArgs(1,"aaa","bbb");
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        // 同一个包里的代码，可以访问缺省和protected
        Phone ph = (Phone) superMarket.getMerchandiseOf(10);
        System.out.println(ph.screenSize);
        System.out.println(ph.memoryG);

        // 同一个包里的代码，可以访问缺省和protected，子类也没问题
        ShellColorChangePhone scp = (ShellColorChangePhone) superMarket.getMerchandiseOf(100);
        System.out.println(scp.screenSize);
        System.out.println(scp.memoryG);

        System.out.println(superMarket.getBiggestProfitMerchandise());
        Class clazz= MerchandiseV2.class;

        //反射
        Method descMethod =clazz.getMethod("describe");
        String str = (String) descMethod.invoke(scp);
        System.out.println(str);

        Method buyMethod =clazz.getMethod("buy", int.class);
        buyMethod.invoke(scp,2);




    }
}
