package OOPS.Interface;

public class Chess {
    public static void main(String[] args) {
        Queen q= new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal(in all direction)");
    }
}

class rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}
class king implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,right,left,diagonal(by one step)");

    }
}