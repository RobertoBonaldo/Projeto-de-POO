import br.cdg.inatel.campeões.*;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Path atiradores =Paths.get("atiradores.txt");
        Path assassinos = Paths.get("assassinos.txt");
        Path lutadores = Paths.get("lutadores.txt");
        Path magos = Paths.get("magos.txt");
        Path suportes = Paths.get("suportes.txt");
        Path tanques = Paths.get("tanques.txt");

        try{

            List<String> passas = Files.readAllLines(assassinos);

            passas.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");
                System.out.println(linhaQuebrada[0]+ "->" + linhaQuebrada[1]+ "->" + linhaQuebrada[2]+ "->" + "Quantidade de skills: " + linhaQuebrada[3]);
                System.out.println("  ");
            });

        }   catch (IOException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        try{

            List<String> plut = Files.readAllLines(lutadores);

            plut.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");
                System.out.println(linhaQuebrada[0]+ "->" + linhaQuebrada[1]+ "->" + linhaQuebrada[2]+ "->" + "Quantidade de skills: " + linhaQuebrada[3]);
                System.out.println("  ");
            });

        }   catch (IOException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        try{

            List<String> patir = Files.readAllLines(atiradores);

            patir.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");
                System.out.println(linhaQuebrada[0]+ "->" + linhaQuebrada[1]+ "->" + linhaQuebrada[2]+ "->" + "Quantidade de skills: " + linhaQuebrada[3]);
                System.out.println("  ");
            });

        }   catch (IOException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        try{

            List<String> pmag = Files.readAllLines(magos);

            pmag.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");
                System.out.println(linhaQuebrada[0]+ "->" + linhaQuebrada[1]+ "->" + linhaQuebrada[2]+ "->" + "Quantidade de skills: " + linhaQuebrada[3]);
                System.out.println("  ");
            });

        }   catch (IOException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        try{

            List<String> psup = Files.readAllLines(suportes);

            psup.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");
                System.out.println(linhaQuebrada[0]+ "->" + linhaQuebrada[1]+ "->" + linhaQuebrada[2]+ "->" + "Quantidade de skills: " + linhaQuebrada[3]);
                System.out.println("  ");
            });

        }   catch (IOException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        try{

            List<String> ptanq = Files.readAllLines(tanques );

            ptanq.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");
                System.out.println(linhaQuebrada[0]+ "->" + linhaQuebrada[1]+ "->" + linhaQuebrada[2]+ "->" + "Quantidade de skills: " + linhaQuebrada[3]);
                System.out.println("  ");
            });

        }   catch (IOException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        Xayah x1 = new Xayah("Xayah rainha o resto nadinha ", "Atiradora", "Tempestade das plumas", 4, 10000);
        Akshan a1 = new Akshan("AKKKKKKKKKKKshan ", "Atirador", "PIU PIU PIU PIU", 4,0);

        x1.darDano();
        a1.darDano();

        if (x1.getDanoX() > a1.getDanoA()){
            System.out.println("                               ");
            System.out.println("Akshan sai da invisibilidade pegando Xayah desprevinida, Akshan gasta todo seu kit de habilidades");
            System.out.println("e no final quando ele acha que ganhará a luta ele lembra que nao da dano, Xayah faz o que faz de melhor ");
            System.out.println("taca pena para todo lado, por fim Xayah elimina Akshan");
        }

    }
}
