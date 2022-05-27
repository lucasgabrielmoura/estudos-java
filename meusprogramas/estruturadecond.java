package meusprogramas;

public class estruturadecond {
    public static void main(String[] args){
        int n = 0; 
        
        if(n == 0){
            System.out.println("Olá world zero");
        };


        if(n == 5){
            System.out.println("Olá world five");
        }else{
            System.out.println("ERR");
        };


        if(n == 5){
            System.out.println("Primeira"); 
        }else if(n == 1){
            System.out.println("Segunda Condição"); 
        }else{
            System.out.println("Terceira Condição"); 
        };


        if(n == 0){
            if(n < 10){
                System.out.println("Nine Condição");  
            };
        };


        switch(n){
            case 1:{
                System.out.println(n);
                break;
            }
            case 0:{
                System.out.println(n);
                break;
            }
            case 2:{
                System.out.println(n);
                break;
            }
            case 3:{
                System.out.println(n);
                break;
            }
            default:{
                throw new IllegalArgumentException("Erro de número:" + n);
            }

        }
    }
}
