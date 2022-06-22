package Interface;

import java.util.Date;

public interface ExpireDateMerchandise {
    //>>TODO 接口中只定义抽象的方法，不实现方法。
    //>>TODO 方法定义：返回值类型 方法名(参数);
    boolean notExpireDay(int day);
    Date getProducedDate();
    Date getExpireDate();
    double leftDatePercentage();
    double actualValueNow(double leftDatePercentage);
    //>>TODO 接口中不能定义局部变量，但是可以定义静态变量。
    int VAL_IN_INTERFACE = 999;
}
