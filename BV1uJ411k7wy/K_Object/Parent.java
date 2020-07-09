package K_Object;

import java.util.Objects;

public class Parent {
    String name = "haha";
    int age = 12;

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parent{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        // getClass 使用反射技术，判断 obj是否为 Parent类型 等效于 obj instanceof Parent
        if (obj == null || getClass() != obj.getClass())
            return false;
        // 向下转型
        Parent parent = (Parent) obj;
        /**
         * public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }
         */
        return age == parent.age && Objects.equals(name, parent.name);
    }
}