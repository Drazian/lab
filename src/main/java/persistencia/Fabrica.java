package persistencia;

public class Fabrica {

    private static Fabrica instancia;

    private Fabrica() {
    };

    public static Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }
    
    public IController getIcontroller() {
    	return new Controller();
    }

}
