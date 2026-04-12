package avaliacao;

public class academica {
public static void main(String[] args) {

float nota = Float.parseFloat(IO.readln("Qual foi sua nota?: "));
float frequencia = Float.parseFloat(IO.readln("Qual foi sua frequencia?: "));

if (nota >= 7 && frequencia >= 75) {
    IO.println("Aprovado");
}else if (nota >= 5 && frequencia >= 75) {
    IO.println("Recuperação");
}else if (nota < 5 && frequencia < 75) {
    IO.println("Reprovado");
}else if (nota == 10) {
    IO.println("Aprovado com excelencia");
}


}

}
