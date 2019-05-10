package Main;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lemo on 2018/9/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num =input.nextInt();
        int[] maxArr=new int[num];
        int[] minArr=new int[num];
        int min=0;
        int max=0;
        int temp=0;
        int tempMin=0;
        int tempMax=0;
        Set<Integer> aSet =new HashSet<>();
        for (int i=0;i<num;i++){
            temp=input.nextInt();
            min=input.nextInt();
            max=input.nextInt();
            min=getMin(temp,min,max);
            max=getMax(temp,min,max);
            for (int j=0;j<i;j++){
                if(min>=minArr[j] && max<=maxArr[j]){
                }else {
                    aSet.add(j);
                }
            }
            maxArr[i]=max;
            minArr[i]=min;
        }
        aSet.stream().forEach(integer ->System.out.println(integer+1) );
        System.out.println();
    }

    private static int getMin(int temp, int min, int max) {
        int minNum=0;
        if(min<temp){
            if(min<max){
                minNum=min;
            }else {
                minNum=max;
            }
        }else {
            if(temp<max){
                minNum=temp;
            }else {
                minNum=max;
            }
        }
        return  minNum;
    }
    private static int getMax(int temp, int min, int max) {
        int maxNum=0;
        if(min>temp){
            if(min>max){
                maxNum=min;
            }else {
                maxNum=max;
            }
        }else {
            if(temp>max){
                maxNum=temp;
            }else {
                maxNum=max;
            }
        }
        return  maxNum;
    }
}
