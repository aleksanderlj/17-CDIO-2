package spil;
//Søren og Joe arbejder her 10.20-11.40

public class Player {

    private Account konto;
    private String name;

    public Player(String name){
        Account konto = new Account();
        this.name = name;
        this.konto = konto;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //lægger nye points til score
    public int addScore(int point){
        int nyScore = konto.addScore(point);
        return nyScore;
    }
}
