package com.example.abstraction;

interface Book {
    void storyTelling();
}

interface Novel extends Book {
    void onlyText();
}

class HarryPotter implements Novel {

    @Override
    public void storyTelling() {
        System.out.println("HarryPotter is story telling");
    }

    @Override
    public void onlyText() {
        System.out.println("HarryPotter is only text");
    }

    public void popular() {
        System.out.println("HarryPotter is popular");
    }
}

class Pilgrim implements Novel {

    @Override
    public void storyTelling() {
        System.out.println("Pilgrim is story telling");
    }

    @Override
    public void onlyText() {
        System.out.println("Pilgrim is only text");
    }

    public void outOfDate() {
        System.out.println("Pilgrim is out of date");
    }
}

class Game {
    public void fun() {
        System.out.println("Game is fun");
    }
}

class OnlineGame extends Game {
    public void multiPlaying() {
        System.out.println("OnlineGame is multi playing");
    }
}

class LeagueOfLeagues extends OnlineGame {

    @Override
    public void multiPlaying() {
        System.out.println("LeagueOfLeagues is multi playing");
    }

    public void rank() {
        System.out.println("Silver");
    }
}



public class Abstraction {

    public static void main(String[] args) {

        Novel[] novels = {new HarryPotter(), new Pilgrim()};
        LeagueOfLeagues lol = new LeagueOfLeagues();

        lol.fun();
        lol.multiPlaying();
        lol.rank();

        for(Novel novel : novels) {
            novel.storyTelling();
            novel.onlyText();
        }

        for(Novel novel : novels) {
            if(novel instanceof HarryPotter) {
                ((HarryPotter) novel).popular();
            } else if(novel instanceof Pilgrim) {
                ((Pilgrim) novel).outOfDate();
            }
        }

    }
}
