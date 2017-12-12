package ejercicio14;

/**
 * @author Arturo
 */
public class Coche{

    private String matricula;

    public Coche(String matricula){
        this.matricula=matricula;
    }

    @Override
    public String toString(){
        return matricula;
    }

}
