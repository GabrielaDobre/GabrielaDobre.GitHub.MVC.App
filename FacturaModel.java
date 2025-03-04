package modelo.facturacion.app;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * Modelo que maneja la lógica de cálculo y carga de datos de la base de datos.
 */

public class FacturaModel {
    private Connection connection;

    public FacturaModel() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes.productos", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga los clientes desde la base de datos y los agrega al JComboBox de la vista.
     */
    public void cargarClientes(JComboBox<String> cmbCliente) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT NOMBREEMPRESA FROM empresas");
            while (rs.next()) {
                cmbCliente.addItem(rs.getString("NOMBREEMPRESA"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga los productos desde la base de datos y los agrega al JComboBox de la vista.
     */
    public void cargarProductos(JComboBox<String> cmbProducto) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT NOMBREPRODUCTO, PRECIO FROM productos");
            while (rs.next()) {
                cmbProducto.addItem(rs.getString("NOMBREPRODUCTO") + " - " + rs.getDouble("PRECIO"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String[] obtenerDatosCliente(String nombreEmpresa) {
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT CIF, DIRECCION FROM empresas WHERE NOMBREEMPRESA = ?");
            stmt.setString(1, nombreEmpresa);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new String[]{rs.getString("CIF"), rs.getString("DIRECCION")};
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new String[]{"", ""};
    }

    /**
     * Calcula el total aplicando descuento e IVA.
     * @param precio Precio base del producto.
     * @param descuento Porcentaje de descuento.
     * @param iva Porcentaje de IVA.
     */
    public double calcularTotal(double precio, double descuento, double iva) {
        double precioConDescuento = precio - (precio * descuento / 100);
        return precioConDescuento + (precioConDescuento * iva / 100);
    }
    public void generarDocumento(String cliente, String producto, double total) {
        try (FileWriter writer = new FileWriter("factura.txt")) {
            writer.write("Factura\n");
            writer.write("Cliente: " + cliente + "\n");
            writer.write("Producto: " + producto + "\n");
            writer.write("Total: " + total + "\n");
            JOptionPane.showMessageDialog(null, "Factura generada exitosamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
