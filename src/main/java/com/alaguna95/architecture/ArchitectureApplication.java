package com.alaguna95.architecture;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchitectureApplication {


  public static void main(String[] args) {

    System.out.println(
        "Hola me llamo alberto estoy probando el formateo que funcione, sabes por que no me"
            + " funciona, yo creo que si escribes normal si te funciona, solo tienes que escribir"
            + " de a me llamo akberto laguna me repito addd a aapoco u entonces Hola me llamo"
            + " alberto estoy probando el formateo que funcione, sabes por que no me funciona, yo"
            + " creo que si escribes normal si te funciona, solo tienes que escribir de a oco u en"
            + " tonce");

    List<String> strings = new ArrayList<>();

    strings.stream().filter(a -> a.equals("Pruebas de efecto")).filter(a -> a.equals(
            "Prueba de " + "sdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd "
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaa" + "ddddddddddddd" + "sdddddddddd"))
        .map(a -> a + "me llamo josesfa").map(a -> {
          return a + a;
        }).collect(Collectors.toList());

    SpringApplication.run(ArchitectureApplication.class, args);
  }

  private String test() {

    for (int a = 0; a < 10; a++) {
      System.out.println("prueba");
    }

    if (true) {
      System.out.println("aa");
    }

    if (false) {
      System.out.println("b");
    }

    return 1 == 1 && 1 == 1 && 1 == 1 && 1 == 1 && 1 == 1 && 1 == 1 && 1 == 1 && 1 == 1 && 1 == 1
        && 1 == 1 && 1 == 1 ? "pesssssssdrito"
        : "jusssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss  "
            + "sssssssssssssssssssssssab";
  }

  private String testttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttsaasdass(
      Integer a) throws IOException {
    throw new IOException("sd");
  }

  private String test2() {
    return 1 == 1 ? "a" : "b";
  }
}