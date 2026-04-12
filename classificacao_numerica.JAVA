public class classificacao_numerica {
public static void main(String[] args) {

    float numero = Float.parseFloat(IO.readln("Digite um numero: "));

    if (numero % 2 == 0 && 10 % 2 == 0) {
        IO.println("O numero e par e multiplo de 10");
        IO.println("Classe A");

    } else if (numero % 2 == 0) {
        IO.println("O numero e par, mas não e multiplo de 10");
        IO.println("Classe B");

    }else if (numero % 1 == 0 && numero <= 50) {
        IO.println("O numero é impar, maior que 50");
        IO.println("Classe C");

    }else{
        IO.println("Nenhuma das alternativas anteriores");
        IO.println("Classe D");
    }


    
}

}

