import java.util.*;
public class dowhile2 {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        int limitUsers = 2;
        Scanner scnUser = new Scanner(System.in);
        String usuario;
        try {
            while (usersLogged.size() < limitUsers) {
                System.out.println("Digite o usuario");
                usuario = scnUser.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);
                } else {
                    System.out.println("Digite um usuario válido");
                }
                Thread.sleep(1000);
            }
            System.out.println("Limite de usuários excedido");
        } catch (InterruptedException e) {
            System.out.println("Ops! Houve algum erro...: " + e);
        }
        scnUser.close();
    }
}
