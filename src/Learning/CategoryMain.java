package Learning;

import Learning.Category;

import java.util.Scanner;

public class CategoryMain {
    public static void main(String[] args){
       //>>TODO Category.values();  返回enum类中定义的所有枚举对象（返回的是数组）
        //使用（1）>>TODO 输出enum类
        for (Category category : Category.values()){
            System.out.println(category.ordinal());  //category.ordinal()返回定义枚举实例的顺序（从零开始）
            System.out.println(category.name()); //category.name()返回枚举实例的名字
        }

        //使用（2）>>TODO 根据对象的名字获取枚举对象
        Category.valueOf("FOOD");

        //使用（3）>>TODO 通过用户的输入读取枚举对象
        Scanner in = new Scanner(System.in);
        String categoryName = in.next();
        Category enumInput = Category.valueOf(categoryName.trim().toUpperCase());

        String categoryName2 = in.next();
        Category enumInput2 = Category.valueOf(categoryName2.trim().toUpperCase());

        //使用（4）>>TODO 比较枚举
        //使用“引用==引用”的形式判断两个enum类对象是否相等
        System.out.println(enumInput == enumInput2);
    }
}
