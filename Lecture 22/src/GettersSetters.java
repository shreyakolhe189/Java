public class GettersSetters {
    public static void main(String[] args){
        PPen p1 = new PPen();

        p1.setColor("Red");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Blue");
        System.out.println(p1.getColor());

    }
}
class PPen{
   String color;
   int tip;

   String getColor(){ //getter
       return this.color;
   }
   int getTip(){
       return this.tip;
   }

   void setColor(String newColor){
       this.color = newColor;
   }
   void setTip(int newTip){
       this.tip = newTip;
   }
}
