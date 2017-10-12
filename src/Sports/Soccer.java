package Sports;

import Play.BallPlay;

public class Soccer extends Sports {
    public Soccer(){
        play = new BallPlay();
    }

    public void playerNum() {
        int number = 11;
        System.out.println("팀원은 " + number + "명 입니다.");
    }

    public void sportsName(){
        System.out.println("===축구===");
    }
}
