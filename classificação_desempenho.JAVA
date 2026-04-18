public class classificacao_desempenho {
public static void main(String[] args) {

float pontuação = Float.parseFloat(IO.readln("Digite sua pontuação: "));

if (pontuação < 0 || pontuação > 100) {
    IO.println("Pontuação invalida");

}else if (pontuação > 90 && pontuação < 100) {
    IO.println("Excelente");

}else if (pontuação > 70 && pontuação < 89) {
    IO.println("Bom");

}else if (pontuação > 50 && pontuação < 69) {
    IO.println("Regular");

}else if (pontuação > 0 && pontuação < 49) {
    IO.println("Insuficiente");
}


}

}
