package app;

import io.jooby.annotations.*;

@Path("/")
public class Controller {

  @GET
  public String sayHi() {
    return "Bem-vindo(a) a calculadora API || Atualmente recebendo comandos...";
  }
}
