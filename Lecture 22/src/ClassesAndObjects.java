public class ClassesAndObjects {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.Tip);

        p1.setColor("Red");
        System.out.println(p1.color);
    }
}
class Pen {
    String color;
    int Tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        Tip = newTip;
    }

}