import java.util.Scanner;

public class BoletinFluxo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
//        Scanner nA = new Scanner(System.in);
//        Scanner n1 = new Scanner(System.in);
//        Scanner n2 = new Scanner(System.in);
//        Scanner n3 = new Scanner(System.in);
//        Scanner n4 = new Scanner(System.in);


        System.out.println("Deseja analisar as notas de um aluno? (S/N)");
        String desejo = s.next();

        while(desejo.equals("S")){
            System.out.println("Favor insira o primeiro nome do aluno.");
            String nomeAluno = s.next();

            System.out.println("Ok, agora insira a primeira nota. Lembre-se de utilizar virgula na separação decimal.");
            Double nota1 = s.nextDouble();

            System.out.println("Perfeito, agora insira a segunda nota.");
            Double nota2 = s.nextDouble();

            System.out.println("Muito bem, favor inserir a terceira nota.");
            Double nota3 = s.nextDouble();

            System.out.println("Ok, por fim insira a quarta e últimma nota.");
            Double nota4 = s.nextDouble();

            Double resultado = (nota1+nota2+nota3+nota4)/4;

            if (resultado<4){
                System.out.println("### Infelismente " +nomeAluno+ " foi REPROVADO com média " +resultado+ " nas avaliações.###");
            } else if (resultado<=6) {
                System.out.println("### ATENÇÃO!!" +nomeAluno+ " está de RECUPERAÇÃO devido a sua média " +resultado+ " nas avaliações. ###");
            } else{
                System.out.println("### Parabêns " +nomeAluno+ " foi APROVADO com média " +resultado+ " nas avaliações. ###");
            }

            System.out.println("Deseja analisar as notas de algum outro aluno? (S/N)");
                desejo = s.next();
        }

        System.out.println("*** Ogrigado por usar o Analisador de Bolitin 2.0 ***");

    }
}