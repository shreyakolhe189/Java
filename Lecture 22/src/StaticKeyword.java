public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sclname = "SPS";

        Student s2 = new Student();
        System.out.println(s2.sclname);
    }
}
class Student {
    String name;
    int roll;

    static String sclname;

    void  setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
