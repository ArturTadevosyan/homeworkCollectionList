package tasks;

import java.util.ArrayList;

public class Tasks231_250 {
    public static void task231(ArrayList<Integer> numbers) {
        System.out.println("Task - 231");
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("number = " + number);
                sum += Math.pow(number, 2);
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("-------------------------------");
    }

    public static void task232(ArrayList<Integer> numbers) {
        System.out.println("Task - 232");
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("number = " + number);
                count++;
            }
        }
        System.out.println(" count = " + count);
        System.out.println("-------------------------------");
    }

    public static void task233(ArrayList<Integer> numbers) {
        System.out.println("Task - 233");
        int sum = 0;
        int multiple = 1;
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("number = " + number);
                sum += number;
                multiple *= number;
            }
        }
        System.out.println(" sum = " + sum + "\nmultiple = " + multiple);
        System.out.println("-------------------------------");
    }


    public static void task234(ArrayList<Integer> numbers) {
        System.out.println("Task - 234");
        int sum = 0;
        double count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("number = " + number);
                sum += number;
                count++;
            }
        }
        if (count != 0) {
            System.out.println("sum = " + sum + " |  count = " + count +
                    "\nsum = " + sum / count);
        }
        System.out.println("-------------------------------");
    }

    public static void task235(ArrayList<Integer> numbers) {
        System.out.println("Task - 235");
        int sum = 0;
        double count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("number = " + number);
                sum += Math.pow(number, 2);
                count++;
            }
        }
        if (count != 0) {
            System.out.println("sum = " + sum + " |  count = " + count +
                    "\nresult = " + Math.sqrt(sum / count));
        }
        System.out.println("-------------------------------");
    }

    public static void task236(ArrayList<Integer> numbers) {
        System.out.println("Task - 236");
        int sum = 0;
        int multiple = 1;
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("number = " + number);
                sum += number;
                multiple *= number;
            }
        }
        System.out.println(" sum = " + sum + "\nmultiple = " + multiple);
        System.out.println("-------------------------------");
    }


    public static void task237(ArrayList<Integer> numbers) {
        System.out.println("Task - 237");
        int count = 0;
        for (int number : numbers) {
            if (number == 0) {
                System.out.println("number = " + number);
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("-------------------------------");
    }

    public static void task238(ArrayList<Integer> numbers) {
        System.out.println("Task - 238");
        int sum = 0;
        double count = 0;
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println("number = " + number);
                sum += Math.abs(number);
                count++;
            }
        }
        if (count != 0) {
            System.out.println("sum = " + sum + " | count = " + count +
                    "\nresult = " + sum / count);
        }
        System.out.println("-------------------------------");
    }

    public static void task239(ArrayList<Integer> numbers) {
        System.out.println("Task - 239");
        int sum = 0;
        double count = 0;
        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.println("number = " + number);
                sum += Math.abs(number);
                count++;
            }
        }
        if (count != 0) {
            System.out.println("sum = " + sum + " | count = " + count +
                    "\nresult = " + Math.sqrt(sum / count));
        }
        System.out.println("-------------------------------");
    }


    public static void task240(ArrayList<Integer> numbers) {
        System.out.println("Task - 240");
        int count = 0;
        for (int number : numbers) {
            if (number % 7 == 0) {
                System.out.println("number = " + number);
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("-------------------------------");
    }

    public static void task241(ArrayList<Integer> numbers, int k) {
        System.out.println("Task - 241");
        int sum = 0;
        for (int number : numbers) {
            if (number % k == 0) {
                System.out.println("number = " + number);
                sum += number;
            }
        }
        System.out.println("sum  = " + sum);
        System.out.println("-------------------------------");
    }

    public static void task242(ArrayList<Integer> numbers, int m) {
        System.out.println("Task - 242");
        int multiple = 1;
        for (int number : numbers) {
            if (number % m == 0) {
                System.out.println("number = " + number);
                multiple *= number;
            }
        }
        System.out.println("multiple  = " + multiple);
        System.out.println("-------------------------------");
    }

    public static void task243(ArrayList<Integer> numbers, int t) {
        System.out.println("Task - 243");
        int count = 0;
        for (int number : numbers) {
            if (number % t == 0) {
                System.out.println("number = " + number);
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("-------------------------------");
    }


    public static void task244(ArrayList<Integer> numbers) {
        System.out.println("Task - 244");
        int multiple = 1;
        for (int number : numbers) {
            if (number % 5 == 2) {
                System.out.println("number = " + number);
                multiple *= number;
            }
        }
        System.out.println("multiple  = " + multiple);
        System.out.println("-------------------------------");
    }


    public static void task245(ArrayList<Integer> numbers) {
        System.out.println("Task - 245");
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if ((number + i) % 3 == 0) {
                System.out.println("number = " + number);
                sum += Math.pow(number, 2);
            }

        }
        System.out.println("sum = " + sum);
        System.out.println("-------------------------------");
    }

//---------------------------------------------------------------------------------------

    public static void task246(ArrayList<Integer> numbers) {
        System.out.println("Task - 246");
        int sum = 0;
        double count = 0;

        System.out.println("size = " + numbers.size());
        int loopSize = numbers.size();
        if (!isSquareNumber(loopSize)) {
            loopSize = (int) Math.sqrt(numbers.size()) + 2;
            System.out.println("is square: loop size = " + loopSize);
        }
        System.out.println();
        for (int i = 0; i < loopSize; i++) {
            int number = numbers.get(i);
            System.out.println(i);
            if (isSquareNumber(i)) {
                System.out.println("number [" + i + "] = " + number);
                sum += number;
                count++;
            }
        }
        if (count != 0) {
            System.out.println("sum = " + sum + " |  count = " + count +
                    "\nsum = " + sum / count);
        }
        System.out.println("-------------------------------");
    }

    private static boolean isSquareNumber(double number) {
        double sqrtNumber = Math.sqrt(number);
        double squareNumber = Double.parseDouble((int) sqrtNumber + ".0");
        return sqrtNumber == squareNumber;
    }

    //---------------------------------------------------------------------------------------
    public static void task247(ArrayList<Integer> numbers) {
        System.out.println("Task - 247");
        int sum = 0;
        double count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number > i) {
                System.out.println("number = " + number);
                sum += Math.pow(number, 2);
                count++;
            }
        }
        if (count != 0) {
            System.out.println("sum = " + sum + " |  count = " + count +
                    "\nsum = " + Math.sqrt(sum / count));
        }
        System.out.println("-------------------------------");
    }

    public static void task248(ArrayList<Integer> numbers, int k) {
        System.out.println("Task - 248");
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (Math.pow(number + i, 2) % k == 0) {
                System.out.println("number = " + number);
                sum += number;
            }
        }

        System.out.println("sum  = " + sum);
        System.out.println("-------------------------------");
    }


    public static void task249(ArrayList<Integer> numbers, int k) {
        System.out.println("Task - 249");
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (Math.abs(numbers.get(i) - i) > k) {
                count++;
            }
        }

        System.out.println("count  = " + count);
        System.out.println("-------------------------------");
    }

    public static void task250(ArrayList<Integer> numbers) {
        System.out.println("Task - 250");
        int multiple = 1;
        double count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if ((number * i) % 3 == 2) {
                System.out.println("number = " + number);
                multiple *= Math.pow(number, 2);
                count++;
            }

        }
        if (count != 0) {
            System.out.println("multiple = " + multiple + " |  count = " + count + "\nsum = " + multiple / count);
        }
        System.out.println("-------------------------------");
    }

}

