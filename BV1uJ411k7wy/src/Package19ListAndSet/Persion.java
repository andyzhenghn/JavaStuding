package Package19ListAndSet;

import java.util.Objects;

public class Persion implements Comparable<Persion> {
    private String name = "hah";
    private Integer age = 18;

    public Persion(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persion persion = (Persion) o;
        return Objects.equals(name, persion.name) &&
                Objects.equals(age, persion.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Persion o) {
        // this - o 升序
        // o - this 降序
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
