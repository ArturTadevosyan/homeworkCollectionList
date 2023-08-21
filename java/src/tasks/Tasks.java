package tasks;

import java.util.ArrayList;

public class Tasks {
    public static void task211(ArrayList<Integer> numbers) {
        System.out.println("Task - 211");
        int sum = 0;
        double count = 0;
        for (int number : numbers) {
            if (number > 0) {
                System.out.println("number = " + number);
                sum += number;
                count++;
            }
        }
        if (count != 0) {
            System.out.println("positive number sum = " + sum + " | positive number count = " + count +
                    "\nsum = " + sum / count);
        }
        System.out.println("-------------------------------");
    }

    public static void task212(ArrayList<Integer> numbers) {
        System.out.println("Task - 212");
        int multiple = 0;
        double count = 0;
        for (int number : numbers) {
            if (number > 0) {
                System.out.println("number = " + number);
                multiple += Math.pow(number, 2);
                count++;
            }
        }
        if (count != 0) {
            System.out.println("positive number sum = " + multiple + " | positive number count = " + count +
                    "\nresult = " + Math.sqrt(multiple / count));
        }
        System.out.println("-------------------------------");
    }


    public static void task213(ArrayList<Integer> numbers) {
        System.out.println("Task - 213");
        int sum = 0;
        double count = 0;
        for (int number : numbers) {
            if (number < 0) {
                System.out.println("number = " + number);
                sum += number;
                count++;
            }
        }
        if (count != 0) {
            System.out.println("negative number sum = " + sum + " | negative number count = " + count +
                    "\nsum = " + sum / count);
        }
        System.out.println("-------------------------------");
    }

    public static void task214(ArrayList<Integer> numbers) {
        System.out.println("Task - 214");
        int sum = 0;
        double count = 0;
        for (int number : numbers) {
            if (number < 0) {
                System.out.println("number = " + number);
                sum += Math.pow(number, 2);
                count++;
            }
        }
        if (count != 0) {
            System.out.println("negative number sum = " + sum + " | negative number count = " + count +
                    "\nresult = " + Math.sqrt(sum / count));
        }
        System.out.println("-------------------------------");
    }

    public static void task215(ArrayList<Integer> numbers) {
        System.out.println("Task - 215");
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("number = " + numbers.get(i));
                sum += numbers.get(i);
            }
        }
        System.out.println("result = " + sum);
        System.out.println("-------------------------------");
    }

    public static void task216(ArrayList<Integer> numbers) {
        System.out.println("Task - 216");
        int multiple = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("number = " + numbers.get(i));
                multiple *= numbers.get(i);
            }
        }
        System.out.println("result = " + multiple);
        System.out.println("-------------------------------");
    }


    public static void task217(ArrayList<Integer> numbers) {
        System.out.println("Task - 217");
        int multiple = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 != 0) {
                System.out.println("number = " + numbers.get(i));
                multiple *= Math.pow(numbers.get(i), 2);
            }
        }
        System.out.println("result = " + multiple);
        System.out.println("-------------------------------");
    }

    public static void task218(ArrayList<Integer> numbers) {
        System.out.println("Task - 218");
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 != 0) {
                System.out.println("number = " + numbers.get(i));
                sum += Math.abs(numbers.get(i));
            }
        }
        System.out.println("result = " + sum);
        System.out.println("-------------------------------");
    }

    public static void task219(ArrayList<Integer> numbers, int k) {
        System.out.println("Task - 219");
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % k == 0) {
                System.out.println("number = " + numbers.get(i));
                count++;
            }
        }
        System.out.println("result count = " + count);
        System.out.println("-------------------------------");
    }


    public static void task220(ArrayList<Integer> numbers) {
        System.out.println("Task - 220");
        int positiveCount = 0;
        int negativeCount = 0;
        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }
        int result = positiveCount + negativeCount;
        System.out.println("result  = " + result);
        System.out.println("-------------------------------");
    }

    public static void task221(ArrayList<Integer> numbers, int startRange, int endRange) {
        System.out.println("Task - 221");
        int sum = 0;
        for (int number : numbers) {
            if (number >= startRange && number <= endRange) {
                System.out.println("number = " + number);
                sum += number;
            }
        }
        System.out.println("sum  = " + sum);
        System.out.println("-------------------------------");
    }

    public static void task222(ArrayList<Integer> numbers, int startRange, int endRange) {
        System.out.println("Task - 222");
        int multiple = 1;
        for (int number : numbers) {
            if (number >= startRange && number < endRange) {
                System.out.println("number = " + number);
                multiple *= number;
            }
        }
        System.out.println("multiple  = " + multiple);
        System.out.println("-------------------------------");
    }

    public static void task223(ArrayList<Integer> numbers, int startRange, int endRange) {
        System.out.println("Task - 223");
        int count = 0;
        for (int number : numbers) {
            if (number > startRange && number < endRange) {
                System.out.println("number = " + number);
                count++;
            }
        }
        System.out.println("count  = " + count);
        System.out.println("-------------------------------");
    }


    public static void task224(ArrayList<Integer> numbers, int k) {
        System.out.println("Task - 224");
        int result = 0;
        for (int number : numbers) {
            if (Math.abs(number) < k) {
                System.out.println("number = " + number);
                result += Math.pow(number, 3);
            }
        }
        System.out.println("result  = " + result);
        System.out.println("-------------------------------");
    }

    public static void task225(ArrayList<Integer> numbers, int t) {
        System.out.println("Task - 225");
        int result = 1;
        for (int number : numbers) {
            if (Math.abs(number) < t) {
                System.out.println("number = " + number);
                result *= number;
            }
        }
        System.out.println("result  = " + result);
        System.out.println("-------------------------------");
    }

    public static void task226(ArrayList<Integer> numbers, int t) {
        System.out.println("Task - 226");
        int count = 0;
        for (int number : numbers) {
            if (Math.abs(number) < t) {
                System.out.println("number = " + number);
                count++;
            }
        }
        System.out.println("count  = " + count);
        System.out.println("-------------------------------");
    }

    public static void task227(ArrayList<Integer> numbers, int k) {
        System.out.println("Task - 227");
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % k == 0) {
                System.out.println("number = " + numbers.get(i));
                sum += numbers.get(i);
                count++;
            }
        }

        System.out.println("result  = " + sum / count);
        System.out.println("-------------------------------");
    }

    public static void task228(ArrayList<Integer> numbers, int k) {
        System.out.println("Task - 228");
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % k == 0) {
                System.out.println("number = " + numbers.get(i));
                sum += numbers.get(i);
            }
        }

        System.out.println("sum  = " + sum);
        System.out.println("-------------------------------");
    }


    public static void task229(ArrayList<Integer> numbers, int k) {
        System.out.println("Task - 229");
        int sum = 1;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number - i > 0) {
                sum *= number;
            }
        }

        System.out.println("sum  = " + sum);
        System.out.println("-------------------------------");
    }

    public static void task230(ArrayList<Double> numbers, int k) {
        System.out.println("Task - 230");
        int sum = 0;
        double count = 0;
        for (double number : numbers) {
            if ((int) number % k == 0) {
                System.out.println("number = " + number);
                sum += Math.pow(number, 2);
                count++;
            }

        }

        System.out.println("result  = " + Math.sqrt(sum / count));
        System.out.println("-------------------------------");
    }
    
}

