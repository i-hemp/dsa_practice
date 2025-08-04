package daily.sat28;

import java.util.Scanner;

//pattern series
public class PatternSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value: ");
        // int x = s.nextInt();
        s.close();
        System.out.println();
        int x = 5;
        // p1(x);//continue number series
        // p2(x);//alter 0 1
        // p3(7);//solid cube of x rows and cols
        // p4(x);//pyramid
        // p5(x);
        // p6(x);// diamond
        // p7(6);
        // p9(x);//z
        // p10(x);//x
        // p11(10);// A
        // System.out.println();
        // p12(x);// M
        // p13(x);// D
        // p14(x);// R
        // p15(x);// I
        // p16(x);// T
        // p15(x);// I

        meth(x);
    }

    public static void meth(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if ((i == 0 && j == x - 1)
                        || (i == x - 1 && j == x - 1))

                {
                    System.out.print("  ");
                    continue;
                }

                if ((i == 0) || j == 0 || i == x - 1 || j == x - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("  ");

            for (int j = 0; j < x; j++) {
                if (i == 0 || i == x / 2 || j == 0 || (j == x - 1 && i <= x / 2)
                        || (i == j && !(i < x / 2)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // System.out.println();
            System.out.print("  ");

            for (int j = 0; j < x; j++) {
                if (i == 0 || i == x - 1 || j == x / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                    System.out.print("  ");

            for (int j = 0; j < x; j++) {
                if (i == 0 || j == x / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            for (int j = 0; j < x; j++) {
                if (i == 0 || i == x - 1 || j == x / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("  ");
            System.out.println();

        }
    }

    private static void p16(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || j == x / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }

    private static void p15(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || i == x - 1 || j == x / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }

    private static void p14(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || i == x / 2 || j == 0 || (j == x - 1 && i <= x / 2)
                        || (i == j && !(i < x / 2)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void p13(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if ((i == 0 && j == x - 1)
                        || (i == x - 1 && j == x - 1))

                {
                    System.out.print("  ");
                    continue;
                }

                if ((i == 0) || j == 0 || i == x - 1 || j == x - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void p12(int x) {
        // System.out.println("* ".repeat(x));
        // System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j == 0 || j == x - 1 || (i == j && i - 1 < (x / 2))
                        || (i == x - j - 1 && i - 1 < (x / 2)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // @SuppressWarnings("unused")

    private static void p11(int x) {

        for (int i = 1; i <= x + 2; i++) {
            for (int j = x - i; j >= -1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || (i - 2 == x / 2))
                    System.out.print("* ");

                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private static void p10(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                // System.out.print("* ");
                if (x - j == i - 1 || i == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private static void p9(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                // System.out.print("* ");
                if (i == 1 || i == x || x - j == i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")

    private static void p8(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {

            }
        }
    }

    @SuppressWarnings("unused")

    private static void p7(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || i == x - 1 || j == 0 || j == x - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")

    private static void p6(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();

        }
        for (int i = x - 2; i >= 0; i--) {
            for (int j = x - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private static void p5(int x) {
        for (int i = x - 1; i >= 0; i--) {
            for (int j = x - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private static void p4(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private static void p3(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private static void p2(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private static void p1(int x) {
        int count = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(String.format("%2d ", (count++)));
            }
            System.out.println();
        }
    }
}
