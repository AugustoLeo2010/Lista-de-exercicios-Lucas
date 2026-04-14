package avaliacao;

public class maior_restricoes {
    public static void main(String[] args) {

        float n1 = Float.parseFloat(IO.readln("Digite o primeiro numero: "));
        float n2 = Float.parseFloat(IO.readln("Digite o segundo numero: "));
        float n3 = Float.parseFloat(IO.readln("Digite o terceiro numero: "));


        int maior = 0;
        int menor = 0;
        if (n1 == n2 && n1 == n3) {
            IO.println("Valores invalidos");

        } else {
            maior = (int) n1;
            menor = (int) n1;

            if (n2 < menor) {
                menor = (int) n2;
            }
            if (n3 < menor) {
                menor = (int) n3;
            }
            if (n2 > maior) {
                maior = (int) n2;
            }
            if (n3 > maior) {
                maior = (int) n3;

            } else if (maior < 0) {
                IO.println("maior invalido");
            }

            IO.println("Menor número: " + menor);
            IO.println("Maior número: " + maior);


        }


    }
}

