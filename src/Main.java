
/*
@Shkarin Konstantin
 */

public class Main {

    static byte myByte = -10;
    static int myInt = -1000;
    static long myLong = -10000L;
    static float myFloat = -0.222F;
    static double myDouble = -0.222;
    static boolean myBoolean = true;
    static char myChar = 'C';
    static String myString = "String";

    public static void main(String[] args) {
                int a = result(1,3,5,6);
                System.out.println("Результат метода result:  "+a);

                boolean b = operation(2,5);
                System.out.println("Результат метода operation:  "+b);

                check(-10);
                string();
            }

            public static int result(int a, int b, int c, int d) {
                int e = a * (b + c) / d;
                return e;
            }
            public static boolean operation ( int a, int b){
                boolean r;
                int summ = a + b;
                if (10 < summ && summ <= 20) {
                    return true;
                } else return false;

            }

            public static void check (int a){
                if (a < 0) {
                    System.out.println("Результат метода check: Передали отрицательное число.");
                } else
                    System.out.println("Результат метода check: Передали положительное число.");
            }

            public static void string () {
                System.out.println("Результат string: Привет, указано имя!");
            }
        }