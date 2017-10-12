package Sports;

import Play.*;

public abstract class Sports {

    protected Play play;

    public Sports(){}

    public abstract void playerNum();
    public void principle(){System.out.println("fair play");}
    public abstract void sportsName();

    public void doPlay(){play.play();}

    public Play getPlay() { return play; }
    public void setPlay(Play play) { this.play = play; }
}
