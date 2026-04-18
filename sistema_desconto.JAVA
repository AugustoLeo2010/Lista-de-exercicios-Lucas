public class sistema_desconto {
public static void main(String[] args) {

float valor = Float.parseFloat(IO.readln("Digite o valor da compra: "));

if (valor >= 500) {
    IO.println("Desconto de 25%");

}else if (valor >= 200 && valor < 500) {
    IO.println("Desconto de 10%");

}else if (valor < 200) {
    IO.println("Sem desconto");

}else if (valor < 0) {
    IO.println("Valor invalido");
}


}

}
