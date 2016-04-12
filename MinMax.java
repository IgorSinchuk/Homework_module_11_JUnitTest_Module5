import java.util.*;


public class MinMax {

    public int[] gerenateArray(){
        Random random=new Random();
        int [] array=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }
        return array;

    }

    public int avg(int []array){
        int result=0;
        for(int i:array){
            result+=i;
        }
        return result/array.length;
    }

    public void equalsAVG(int a, int b){
        if(a>b){
            System.out.println("Среднее значение чисел первого массива больше чем среднее значение чисел второго "+a+">"+b);
        }else if(a<b){
            System.out.println("Среднее значение чисел второго массива больше чем среднее значение чисел первого "+b+">"+a);
        }else{
            System.out.println("Среднее значение чисел равны "+a+"="+b);
        }

    }

    public static void main(String[] args) {
        MinMax mw= new MinMax();
        int[] firstArray=mw.gerenateArray();
        int[] secondArray=mw.gerenateArray();
        for(int i:firstArray){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:secondArray){
            System.out.print(i+" ");
        }
        System.out.println();
        mw.equalsAVG(mw.avg(firstArray), mw.avg(secondArray));

    }

}