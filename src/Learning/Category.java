package Learning;

public enum Category {
    // >> TODO 必须在最开始以这种形式创建出所有的枚举对象
    // >> TODO 创建的对象不可以重名
    FOOD(1), // 1~n-1必须为逗号
    COOK(3),
    SNACK(5);// 必须为分号

    private int id;
    // >> TODO 构造方法默认为private的，因此可以不写
    //private Category(int id)
    Category(int id) {
        this.id = id;
    }
}


