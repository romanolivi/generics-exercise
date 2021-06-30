package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer shohei = new BaseballPlayer("Shohei");
        SoccerPlayer bale = new SoccerPlayer("Bale");

        Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");
//        realMadrid.addPlayer(shohei);
        realMadrid.addPlayer(bale);
//        realMadrid.addPlayer(joe);

        System.out.println(realMadrid.numPlayers());

        Team<BaseballPlayer> angels = new Team<>("Angles");
        angels.addPlayer(shohei);

        Team<BaseballPlayer> yankees = new Team<>("Yankees");
        Team<BaseballPlayer> mets = new Team<>("Mets");

        Team<FootballPlayer> dolphins = new Team<>("Dolphins");
        Team<FootballPlayer> giants = new Team<>("Giants");

        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        Team<SoccerPlayer> juventus = new Team<>("Juventus");

        yankees.matchResult(angels, 11, 5);
        yankees.matchResult(mets, 4, 7);

        chelsea.matchResult(realMadrid, 2, 1);
        juventus.matchResult(chelsea, 2, 2);

        Team<FootballPlayer> brokenTeam = new Team<>("this wont work");
        brokenTeam.addPlayer(joe);

        System.out.println("Rankings");
        System.out.println(realMadrid.getName() + ": " + realMadrid.ranking());
        System.out.println(chelsea.getName() + ": " + chelsea.ranking());
        System.out.println(juventus.getName() + ": " + juventus.ranking());
    }
}




























