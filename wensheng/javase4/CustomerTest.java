package com.wensheng.javase4;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer();

        //私有的属性不能直接访问，这就是封装
        //c.id = 100;

        //操作入口变成了只能通过set和get方法访问
        //在set方法和get方法执行过程中进行安全过滤
        c.setAddr("四川省南充市南部县大桥镇桂花街100号");
        c.setAge(18);
        c.setId(123);
        c.setName("李超");

        System.out.println(c.getAddr());
        System.out.println(c.getId());
        System.out.println(c.getAge());
        System.out.println(c.getName());
    }
}
