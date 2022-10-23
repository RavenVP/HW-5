import java.util.ArrayDeque;
import java.util.Queue;

public class HW8_2_2 {
    public static void main(String[] args) {
        Queue<String> q1 = new ArrayDeque<>(5);
        Queue<String> q2 = new ArrayDeque<>(5);
        for (int i = 0; i < Math.random() * 6; i++) {
            q1.offer("TestQ1" + i);
        }
        for (int i = 0; i < Math.random() * 6; i++) {
            q2.offer("TestQ2" + i);
        }
        System.out.println(q1);
        System.out.println(q2);

        addQueue(q1,q2,"Test");
    }

    static void addQueue(Queue<String> q1, Queue<String> q2, String name) {
        if (q1.size() == q2.size() && q1.size() == 5) {
            System.out.println("Галя!");
            return;
        }
        if (q1.size() > q2.size()) {
            q2.add(name);
        }
        if (q2.size() > q1.size()) {
            q1.add(name);
        }
        System.out.println(q1.size());
        System.out.println(q2.size());
    }



    static void removeQueue(Queue<String> q1,Queue<String> q2) {
        if (Math.random() < 0.5) {
            q1.poll();
        } else {
            q2.poll();
        }

    }
}
