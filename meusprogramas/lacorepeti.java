package meusprogramas;

public class lacorepeti {
    public static void main(String[] args){
        int n = 0;

        while(n <= 10){
            if(n == 5){
                int contanumber;
                contanumber = n * 5;
                System.out.println("O número da 5 posição na razão de 5 é: "+ contanumber);
            }
            n++;
        }

        n = 0;

        do{
            System.out.println("O número é "+ n);
            n++;
        }while(n<=10);

        for(int number = 0; number <= 10; number++){
            System.out.println("O número + 3 é igual a: " + (3 + number));
        }
    }
}
