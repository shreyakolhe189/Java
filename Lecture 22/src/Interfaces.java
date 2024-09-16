public class Interfaces {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}

//multiple inheritance
interface Herbivore {
    void eats();
}
interface Carnivore {
    void eats();
}
class Bear implements Herbivore, Carnivore {
    public static eats() {
        System.out.println("Bear eats");
    }
}
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right,diagonal (all directions)");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal (by 1 step)");
    }
}
