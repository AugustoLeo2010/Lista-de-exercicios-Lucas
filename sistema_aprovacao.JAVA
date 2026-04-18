public class sistema_aprovação {
public static void main(String[] args) {

float NP = Float.parseFloat(IO.readln("Digite a nota da prova: "));
    float NR = Float.parseFloat(IO.readln("Digite a nota da redação: "));

if (NP == 100 || NR == 100) {
    IO.println("Destaque da avaliação");

}else if (NP >= 70 && NR >= 70) {
    IO.println("Aprovado");

}else if (NP >= 50 && NR >= 50) {
    IO.println("Lista de espera");

}else if (NP < 50 && NR < 50) {
    IO.println("Eliminado");
}



}

}
