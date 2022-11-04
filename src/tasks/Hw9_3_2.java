package tasks;

import java.util.HashSet;
import java.util.Set;

public class Hw9_3_2 {
    public static void main(String[] args) {
        System.out.println(Exercise());
    }

    public static Set<String> Exercise() {
        Set<String> pairs = new HashSet<>();
        int q, w;
        int size = 15;
        while (pairs.size() < size) {
            q = (int) (Math.random() * 9) + 1;
            w = (int) (Math.random() * 9) + 1;
            if (!pairs.contains(q + " * " + w) && (!pairs.contains(q + " * " + w))) {
                pairs.add(q + " * " + w + "\n");
            }
        }
        return pairs;
    }
}