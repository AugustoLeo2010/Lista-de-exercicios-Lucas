public class classificacao_produtos {
public static void main(String[] args) {

float preço = Float.parseFloat(IO.readln("Digite o preço do produto: "));

if (preço == 0 || preço < 0) {
    IO.println("Preço invalido");

}else if (preço > 0 && preço < 50) {
    IO.println("Produto barato");

}else if (preço > 51 && preço < 150) {
    IO.println("Produto intermediario");

}else if (preço > 150) {
    IO.println("produto premium");
}



}

}
