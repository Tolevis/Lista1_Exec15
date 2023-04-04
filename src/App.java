import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       
        double salarioH,horasTrabalhadas,salarioBruto,descontos,iNSS,sindicato,salarioLiquido,iR;
     
        System.out.println("Quanto Voce Ganha por Hora? ");
        salarioH = entrada.nextDouble();
        
        System.out.println("Horas Trabalhadas no Mes? ");
        horasTrabalhadas = entrada.nextDouble();
        
        salarioBruto = salarioH * horasTrabalhadas;
        System.out.println("Salario Bruto: "+ salarioBruto);
        
        iR = 0.11;
        iR = salarioBruto * iR;
        System.out.println("Valor pago ao IR: "+ iR);
        
        iNSS = 0.08;
        iNSS = salarioBruto * iNSS;
        System.out.println("Valor pago ao INSS: "+ iNSS);
        
        sindicato = 0.05;  
        sindicato = salarioBruto * sindicato;
        System.out.println("Valor pago ao Sindicato: "+ sindicato);
        
        descontos = 0.24;
        salarioLiquido = salarioBruto * (1 - descontos);
        System.out.println("Seu Salario Liquido é: "+ salarioLiquido);
        
        entrada.close();
    }
}