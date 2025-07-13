public class MaxMinArray{
    public static void main(String[] args){
        int[]  a= {3,9,1,7,4};
        int max =a[0],min = a[0];
        for(int num:a){
            if(num>max) max=num;
            if(num<min) min=num;
        }
        System.out.println("Max:" + max + ",Min: " +min);
    }

}
