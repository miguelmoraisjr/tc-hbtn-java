public class PrintStringConcat {
    public static void main(String[] args) {
        String texto1 = "Holberton";
        String texto2 = "School";
        String texto3 = texto1.concat(" " + texto2);
        System.out.print("Bem vindo a " + texto3 + "!");
    }
}