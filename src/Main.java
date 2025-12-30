import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import dao.Dao;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        Dao dao = new Dao();
        boolean menu = true;
        boolean cadastrado = false;
        String gmail = "";
        String senha = "";
        String nome = "";
        String log = "";

        while (menu){
            System.out.println("1 - Login");
            System.out.println("2 - Cadastrar");
            System.out.println("3 - Esqueceu a senha?");
            String a = ler.nextLine();
            switch (a){
                case "2":
                    System.out.println("Digite seu nome");
                    nome = ler.nextLine();
                   while (true){
                       System.out.println("Digite seu email");
                       gmail = ler.nextLine();
                       if (gmail.contains("@") && gmail.contains(".")){
                           break;
                       }else{
                           System.out.println("Email Inválido.");
                       }
                   }
                    System.out.println("Digite sua Senha");
                    senha = ler.nextLine();
                    System.out.println("Confirme sua Senha");
                    String senha2 = ler.nextLine();
                    if (senha.equals(senha2)) {
                        if (dao.login(nome, senha)) {
                            System.out.println("Usuário já existe, escolha outro nome.");
                        } else {
                            boolean sucesso = dao.cadastrar(nome, gmail, senha, log);
                            if (sucesso) {
                                System.out.println("Parabéns, você foi cadastrado.");
                                break;
                            } else {
                                System.out.println("Erro ao cadastrar usuário no banco.");
                            }
                        }
                    } else {
                        System.out.println("Senha incorreta com a primeira.");
                    }


                case "1":
                    System.out.println("Digite seu nome");
                    String nome1 = ler.nextLine();
                    System.out.println("Digite sua Senha");
                    String senha3 = ler.nextLine();

                    boolean logado = dao.login(nome1, senha3); // consulta no banco
                    if (logado) {
                        System.out.println("Parabéns, você acessou.");
                    } else {
                        System.out.println("Nome ou senha incorretos.");
                    }
                    break;


                case "3":
                    Random aleatorio = new Random();
                    String sorteio = "ABCDEFGHIJKLMNOPQRSTUVXYZ123456789";
                    for (int i = 1; i <= 4; i++){
                        char sorteado = sorteio.charAt(aleatorio.nextInt(sorteio.length()));
                        System.out.print(sorteado);
                    }
                    System.out.println();

            }


        }


    }

}
