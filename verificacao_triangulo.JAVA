public class verificacao_triangulo {
    public static void main(String[] args) {

float l1 = Float.parseFloat(IO.readln("Digite o primeiro lado do triangulo: "));
float l2 = Float.parseFloat(IO.readln("Digite o segundo lado do triangulo: "));
float l3 = Float.parseFloat(IO.readln("Digite o terceiro lado do triangulo: "));

if (l1 <= 0 || l2 <= 0 || l3 <= 0 ) {
IO.println("Lado invalido");

}else if (l1 == l2 && l1 == l3) {
    IO.println("Equilatero");

}else if (l1 == l2) {
    IO.println("Isosceles");

}else if (l1 != l2 && l1 != l3) {
    IO.println("Escaleno");

}else {
    IO.println("Não forma triangulo");
}


}

}
