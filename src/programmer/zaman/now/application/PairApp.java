package programmer.zaman.now.application;

import programmer.zaman.now.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String, Integer>("Sony", 28);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
    }
}
