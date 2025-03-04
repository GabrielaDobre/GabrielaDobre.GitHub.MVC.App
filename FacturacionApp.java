package main.facturacion.app;
import javax.swing.JFrame;
import controlador.facturacion.app.FacturaController;
import modelo.facturacion.app.FacturaModel;
import vista.facturacion.app.FacturaView;

/**
 * Clase principal que inicia la aplicación.
 */
public class FacturacionApp {
    public static void main(String[] args) {
        FacturaView view = new FacturaView();
        FacturaModel model = new FacturaModel();
        new FacturaController(view, model);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
    }
}
