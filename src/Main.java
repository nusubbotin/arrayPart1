public class Main {

    // Задание 1
    public static void task1(){
        System.out.println("Задание 1:");

        int [] box = new int[]{1, 2, 3};
        double [] num = {1.57, 7.654, 9.986};
        char [] anyArr = new char[2];

    }

    // Задание 2
    public static void task2(){
        System.out.println("Задание 2:");

        int [] box = new int[]{1, 2, 3};
        double [] num = {1.57, 7.654, 9.986};
        char [] anyArr = {'a', 'b'};

        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i]);
            if (i < box.length-1) {
                System.out.print(", ");
            }else {
                System.out.print("\n");
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length-1) {
                System.out.print(", ");
            }else {
                System.out.print("\n");
            }
        }

        for (int i = 0; i < anyArr.length; i++) {
            System.out.print(anyArr[i]);
            if (i < anyArr.length-1) {
                System.out.print(", ");
            }else {
                System.out.print("\n");
            }
        }

    }

    // Задание 3
    public static void task3(){
        System.out.println("Задание 3:");

        int [] box = new int[]{1, 2, 3};
        double [] num = {1.57, 7.654, 9.986};
        char [] anyArr = {'a', 'b'};

        for (int i = box.length - 1; i >= 0; i--) {
            System.out.print(box[i]);
            if (i > 0) {
                System.out.print(", ");
            }else {
                System.out.print("\n");
            }
        }

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i > 0) {
                System.out.print(", ");
            }else {
                System.out.print("\n");
            }
        }

        for (int i = anyArr.length - 1; i >= 0; i--) {
            System.out.print(anyArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }else {
                System.out.print("\n");
            }
        }

    }

    // Задание 4
    public static void task4(){
        System.out.println("Задание 4:");

        int [] box = new int[]{1, 2, 3};

        for (int i = 0; i < box.length; i++) {
            if (box[i] % 2 == 1){
                box[i] = box[i] + 1;
            }
            System.out.println(box[i]);
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}