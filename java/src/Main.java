import tasks.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerNumbers = new ArrayList<>(Arrays.asList(-10, 2, 9, -15, 8, -1));
        ArrayList<Double> doublesNumbers = new ArrayList<>(Arrays.asList(-1.22, 5.12, 20.1, -15.55, 8.2, -1.56));
        Tasks.task211(integerNumbers);
        Tasks.task212(integerNumbers);
        Tasks.task213(integerNumbers);
        Tasks.task214(integerNumbers);
        Tasks.task215(integerNumbers);
        Tasks.task216(integerNumbers);
        Tasks.task217(integerNumbers);
        Tasks.task218(integerNumbers);
        Tasks.task219(integerNumbers, 3);
        Tasks.task220(integerNumbers);
        Tasks.task221(integerNumbers, -10, 11);
        Tasks.task222(integerNumbers, -20, 1);
        Tasks.task223(integerNumbers, 0, 11);
        Tasks.task224(integerNumbers, 5);
        Tasks.task225(integerNumbers, 5);
        Tasks.task226(integerNumbers, 5);
        Tasks.task227(integerNumbers, 5);
        Tasks.task228(integerNumbers, 5);
        Tasks.task229(integerNumbers, 5);
        Tasks.task230(doublesNumbers, 5);


    }
}
