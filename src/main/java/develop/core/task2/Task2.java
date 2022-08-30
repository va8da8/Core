package develop.core.task2;


import java.lang.reflect.Array;
import java.util.Arrays;

//Отсортируйте массив [5,6,3,2,5,1,4,9]
public class Task2 {
    public static void main(String... args) {
        int[]mass={5,6,3,2,5,1,4,9};
        bubbleSort(mass);
        System.out.println(Arrays.toString(mass));
        for(int q:mass) {
            System.out.print(q + " ");
        }
    }


    public static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
