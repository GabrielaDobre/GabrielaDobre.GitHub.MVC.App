package controlador.facturacion.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.facturacion.app.FacturaModel;
import vista.facturacion.app.FacturaView;

/**
 * Controlador que maneja la interacción entre la vista y el modelo.
 */
public class FacturaController {
    
	 /**
     * Constructor que inicializa el controlador y configura los eventos.
     * @param view La vista de la aplicación.
     * @param model El modelo que maneja la lógica de negocio.
     */
	public FacturaController(FacturaView view, FacturaModel model) {
        model.cargarClientes(view.getCmbCliente());
        model.cargarProductos(view.getCmbProducto());

        view.getCmbCliente().addActionListener(e -> {
            String nombreEmpresa = (String) view.getCmbCliente().getSelectedItem();
            String[] datos = model.obtenerDatosCliente(nombreEmpresa);
            view.setClienteInfo(datos[0], datos[1]);
        });

        view.getCmbProducto().addActionListener(e -> {
            String selectedItem = (String) view.getCmbProducto().getSelectedItem();
            if (selectedItem != null) {
                String[] parts = selectedItem.split(" - ");
                if (parts.length == 2) {
                    view.setPrecio(Double.parseDouble(parts[1]));
                }
            }
        });
        view.getBtnCalcular().addActionListener(e -> {
            double precio = view.getPrecio();
            double descuento = view.getDescuento();
            double iva = view.getIVA();
            double total = model.calcularTotal(precio, descuento, iva);
            view.setTotal(total);
            model.generarDocumento(view.getClienteSeleccionado(), view.getProductoSeleccionado(), total);
        });    
    }
}
