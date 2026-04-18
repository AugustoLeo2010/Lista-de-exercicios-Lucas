public class analise_multiplos {
public static void main(String[] args) {

float numero = Float.parseFloat(IO.readln("Digite um numero: "));


if (numero % 3 == 0 && numero % 5 == 0) {
    IO.println("FizzBuzz");

}else if (numero % 3 == 0) {
    IO.println("Fizz");

}else if (numero % 5 == 0) {
    IO.println("Buzz");

}else {
    IO.println("Numero comum");
}



}

}
