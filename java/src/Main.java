import tasks.Tasks211_230;
import tasks.Tasks231_250;
import tasks.Tasks251_260;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerNumbers = new ArrayList<>(Arrays.asList(-10, 2, 9, -15, 8, -1, 5, -5, -15, 122, 50));
        ArrayList<Double> doublesNumbers = new ArrayList<>(Arrays.asList(-1.22, 5.12, 20.1, -15.55, 8.2, -1.56));

        System.out.println("--------------------------- \n Task 211-230 \n---------------------------");
        Tasks211_230.task211(integerNumbers);
        Tasks211_230.task212(integerNumbers);
        Tasks211_230.task213(integerNumbers);
        Tasks211_230.task214(integerNumbers);
        Tasks211_230.task215(integerNumbers);
        Tasks211_230.task216(integerNumbers);
        Tasks211_230.task217(integerNumbers);
        Tasks211_230.task218(integerNumbers);
        Tasks211_230.task219(integerNumbers, 3);
        Tasks211_230.task220(integerNumbers);
        Tasks211_230.task221(integerNumbers, -10, 11);
        Tasks211_230.task222(integerNumbers, -20, 1);
        Tasks211_230.task223(integerNumbers, 0, 11);
        Tasks211_230.task224(integerNumbers, 5);
        Tasks211_230.task225(integerNumbers, 5);
        Tasks211_230.task226(integerNumbers, 5);
        Tasks211_230.task227(integerNumbers, 5);
        Tasks211_230.task228(integerNumbers, 5);
        Tasks211_230.task229(integerNumbers);
        Tasks211_230.task230(doublesNumbers, 5);


        System.out.println("--------------------------- \n Task 231-250 \n---------------------------");
        Tasks231_250.task231(integerNumbers);
        Tasks231_250.task232(integerNumbers);
        Tasks231_250.task233(integerNumbers);
        Tasks231_250.task234(integerNumbers);
        Tasks231_250.task235(integerNumbers);
        Tasks231_250.task236(integerNumbers);
        Tasks231_250.task237(integerNumbers);
        Tasks231_250.task238(integerNumbers);
        Tasks231_250.task239(integerNumbers);
        Tasks231_250.task240(integerNumbers);
        Tasks231_250.task241(integerNumbers, 2);
        Tasks231_250.task242(integerNumbers, 6);
        Tasks231_250.task243(integerNumbers, 4);
        Tasks231_250.task244(integerNumbers);
        Tasks231_250.task245(integerNumbers);
        Tasks231_250.task246(integerNumbers);
        Tasks231_250.task247(integerNumbers);
        Tasks231_250.task248(integerNumbers, 5);
        Tasks231_250.task249(integerNumbers, 7);
        Tasks231_250.task250(integerNumbers);

        System.out.println("--------------------------- \n Task 251-260 \n---------------------------");
        Tasks251_260.task251getMaxNumber(integerNumbers);
        Tasks251_260.task252getMinNumber(integerNumbers);
        Tasks251_260.task253(integerNumbers);
        Tasks251_260.task254(integerNumbers);
        Tasks251_260.task255(integerNumbers);
        Tasks251_260.task256(integerNumbers);
        Tasks251_260.task257(integerNumbers);
        Tasks251_260.task258(integerNumbers);
        Tasks251_260.task259(integerNumbers);
        Tasks251_260.task260(integerNumbers);

    }
}
