package Practice_08_11_2021.constructor;

public class Student {

    public String name;
    public int age,batchNumber;
    public static String schoolName;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        // this.name = name;
        this(name);
        this.age = age;
    }

    public Student(String name, int age, int batchNumber) {
        // this.name = name;
        //  this.age = age;
        this(name,age);
        this.batchNumber = batchNumber;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
