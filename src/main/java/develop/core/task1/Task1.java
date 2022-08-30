package develop.core.task1;


import java.util.Scanner;

/*
* Заполните массив случайным числами и выведите максимальное, минимальное и
* среднее значение.
* (как оказалось, это двумерный массив 5*5)
 */
class Task1 {
    public static void main(String... args) {


        try {
            int N,k,t;
            double sred=0;
            double sum=0;
            do {
                Scanner in = new Scanner(System.in);
                System.out.print
                        ("Введите число больше или равно 5:  ");
                N = in.nextInt();
                if (N >= 5) {
                    int[][] mass = new int[N][N];
                    //инициализация двумерного массива
                    for (int i = 0; i < mass.length; i++) {
                        for (int j = 0; j < mass[i].length; j++) {
                            mass[i][j] = (i * 2) + j + 1;
                            //вывод массива
                            System.out.print(mass[i][j] + "\t");
                            //вычисляем среднее ар число
                            sum+=mass[i][j];
                            sred=sum/mass.length;

                        }
                        System.out.println();
                    }
                    //Поиск минимума и максимума в массиве
                    //задаем начальные значения мин и макс
                    int min = mass[0][0], max = mass[0][0], maxi = 0,
                            maxj = 0, mini = 0, minj= 0;
                    for(int i=0;i<N;i++) {//Цикл по строкам
                        for (int j = 0; j < N; j++) {// Цикл по колонкам
                            k = mass[i][j]; // Получаем элемент массива
                            //Поиск максимума
                            if (k > max) {
                                max = k;
                                maxi = i;
                                maxj = j;
                            }
                            //Поиск минимума
                            if (k < min) {
                                min = k;
                                mini = i;
                                minj = j;
                            }
                        }
                    }
                    System.out.println("min = "+min);
                    System.out.println("sred = "+sred);
                    System.out.println("max = "+max);
                } else
                    System.out.println
                            ("Вы ввели неправильное число");
            } while (N < 5);
        } catch (Exception e) {
            System.out.println
                    ("вы ввели не число,программа закрыта");
        }
    }
}
