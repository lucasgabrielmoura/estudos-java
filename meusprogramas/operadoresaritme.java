package meusprogramas;

public class operadoresaritme {
    public static void main(String[] args){
        int num1,num2,num3;

        num1 = 10;
        num2 = 20;
        num3 = num2%num1;

        System.out.println("O resultado da soma é : " + num3);


        //Incrementando
        while(num1 <= 10){
            System.out.println(num1);
            num1++;
        }

        //Decrementando
        while(num1 >= 10){
            System.out.println(num1);
            num1--;
        }
    }
}
