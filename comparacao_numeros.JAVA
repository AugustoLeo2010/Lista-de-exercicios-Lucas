package comparacao;

public class numeros {
public static void main(String[] args) {

    float n1 = Float.parseFloat(IO.readln("Digite o primeiro numero: "));
    float n2 = Float.parseFloat(IO.readln("Digite o segundo numero: "));


if (n1 <= 0 || n2 <= 0 ) {
    IO.println("Ambos os numeros são negativos");

}else if (n1 == n2) {
    IO.println("Numeros iguais");

}else if (n1 > n2) {
    IO.println("Primeiro numero é maior");

}else if (n2 > n1) {
    IO.println("Segundo numero é maior");
}



}

}
