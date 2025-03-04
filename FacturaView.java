package vista.facturacion.app;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa la vista de la aplicación de facturación.
 * Contiene los campos de entrada y los elementos visuales.
 */
public class FacturaView extends JFrame {
    private JComboBox<String> cmbProducto, cmbCliente, cmbDescuento, cmbIVA;
    private JTextField txtPrecio, txtCIF, txtDireccion;
    private JButton btnCalcular;
    private JLabel lblTotal;

    /**
     * Constructor que inicializa la interfaz gráfica de la factura.
     */
    public FacturaView() {
        
    	setTitle("Sistema de Facturación");
        setSize(500, 400);
        setLayout(new BorderLayout());

        JPanel panelNorth = new JPanel();
        panelNorth.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, Color.BLUE));
        panelNorth.setBackground(Color.WHITE);
        panelNorth.add(new JLabel("Cliente:"));
        cmbCliente = new JComboBox<>();
        cmbCliente.setBackground(Color.lightGray);
        panelNorth.add(cmbCliente);
        
        panelNorth.add(new JLabel("CIF:"));
        txtCIF = new JTextField(10);
        txtCIF.setEditable(false);
        panelNorth.add(txtCIF);
        
        panelNorth.add(new JLabel("Dirección:"));
        txtDireccion = new JTextField(15);
        txtDireccion.setEditable(false);
        panelNorth.add(txtDireccion);
        add(panelNorth, BorderLayout.NORTH);

        JPanel panelMid = new JPanel();
        panelMid.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, Color.BLUE));
        panelMid.setBackground(Color.WHITE);
        panelMid.add(new JLabel("Producto:"));
        cmbProducto = new JComboBox<>();
        cmbProducto.setBackground(Color.lightGray);
        panelMid.add(cmbProducto);
        
        panelMid.add(new JLabel("Precio:"));
        txtPrecio = new JTextField(10);
        txtPrecio.setEditable(false);
        txtPrecio.setFont(new Font("Times New Roman", Font.BOLD, 12));
        panelMid.add(txtPrecio);
        add(panelMid, BorderLayout.CENTER);

        JPanel panelSouth = new JPanel();
        panelSouth.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, Color.BLUE));
        panelSouth.setBackground(Color.WHITE);
        panelSouth.add(new JLabel("Descuento (%):"));
        cmbDescuento = new JComboBox<>(new String[]{"0", "5", "10", "15", "20"});
        cmbDescuento.setBackground(Color.lightGray);
        panelSouth.add(cmbDescuento);
        
        panelSouth.add(new JLabel("IVA (%):"));
        cmbIVA = new JComboBox<>(new String[]{"21", "10", "0"});
        cmbIVA.setBackground(Color.lightGray);
        panelSouth.add(cmbIVA);
        
        btnCalcular = new JButton("Calcular Total");
        panelSouth.add(btnCalcular);
        lblTotal = new JLabel("Total: ");
        lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
        panelSouth.add(lblTotal);
        add(panelSouth, BorderLayout.SOUTH);
        
    }

    public JComboBox<String> getCmbProducto() { 
    	return cmbProducto; 
    }
    public JComboBox<String> getCmbCliente() { 
    	return cmbCliente;
    }
    public JComboBox<String> getCmbDescuento() { 
    	return cmbDescuento; 
    }
    public JComboBox<String> getCmbIVA() {
    	return cmbIVA;
    }
    public JButton getBtnCalcular() {
    	return btnCalcular;
    }
    public void setPrecio(double precio) { 
    	txtPrecio.setText(String.valueOf(precio)); 
    }
    public double getPrecio() { 
    	return Double.parseDouble(txtPrecio.getText());
    }
    public double getDescuento() {
    	return Double.parseDouble((String) cmbDescuento.getSelectedItem());
    }
    public double getIVA() {
    	return Double.parseDouble((String) cmbIVA.getSelectedItem());
    }
    public void setTotal(double total) {
    	lblTotal.setText("Total: " + total); 
    }
    public void setClienteInfo(String cif, String direccion) { 
        txtCIF.setText(cif);
        txtDireccion.setText(direccion);
    }
    public String getClienteSeleccionado() {
    	return (String) cmbCliente.getSelectedItem(); 
    }
    public String getProductoSeleccionado() { 
    	return (String) cmbProducto.getSelectedItem(); 
    }
}
