package meusprogramas;

public class operadorelalogicos {
    public static void main(String[] args){
        //Operadores relacionais < == === > >= <=
        int num1 = 1;
        int num2 = 10;
        if(num1 == 1){
            System.out.println("Olá mundo");
            System.out.println("-------------------------------");
        }

        if(num1 == 2){
            System.out.println("Olá mundo 2");
        }

        while(num2 >= 0){
            if(num2 == 5){
                System.out.println("Falta 5 segundos para o fim do round");
            }else{
                System.out.println(num2 + "s");
            }       
            num2--;
        }

        //Operadores lógicos || / && 
        num2 = 10;
        num1 = 2;

        if((num2 > num1) && (num1 == 1)){
            System.out.println("Operadores lógicos em ação 1");
        } else if ((num1 == 2) || (num2 < num1)){
            System.out.println("Operadores lógicos em ação 2");
        }
    }

}
