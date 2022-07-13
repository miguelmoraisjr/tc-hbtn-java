import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SerializarEstudantes<Estudante>{

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        FileOutputStream fos = null;
        ObjectOutputStream oss = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oss = new ObjectOutputStream(fos);
            for (Estudante estudante: estudantes) {
                oss.writeObject(estudante);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel serializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        } finally {
            if (oss != null) {
                try {
                    oss.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel serializar");
                }
            }
        }
    }

    public List<Estudante> desserializar() {
        FileInputStream fis = null;
        ObjectInputStream iss = null;
        List<Estudante> estudantes = new ArrayList<>();
        Estudante estudante = null;

        try {
            fis = new FileInputStream(nomeArquivo);
            iss = new ObjectInputStream(fis);
            boolean check = false;
            while ((estudante = (Estudante) iss.readObject()) != null) {
                estudantes.add(estudante);
            }
            return estudantes;
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            System.out.print("Nao foi possivel desserializar");
        }
        finally {
            if (iss != null) {
                try {
                    iss.close();
                } catch (IOException e) {
                    System.out.print("Nao foi possivel desserializar");
                }
            }
        }
        return estudantes;
    }
}
