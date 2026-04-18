public class classificacao_numeros {
public static void main(String[] args) {

    float numero = Float.parseFloat(IO.readln("Digite o numero: "));
    
 if (numero > 0 && numero % 2 == 0) {
     IO.println("Numero positivo e par");

 }else if (numero > 0 && numero % 1 == 0) {
     IO.println("Numero positivo e impar");

 }else if (numero < 0 && numero % 2 == 0) {
     IO.println("Numero negativo e par");

 }else if (numero < 0 && numero % 1 == 0) {
     IO.println("Numero negativo e impar");

}else if (numero == 0) {
    IO.println("Neutro");
}



}

}
