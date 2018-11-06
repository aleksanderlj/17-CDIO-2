package spil;

public class Account {
    public int score = 1000;

    public int getScore(){
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int addScore(int point){
        this.score =+ point;
        if (this.score < 0)
            this.score = 0;
        return this.score;

    }
}
