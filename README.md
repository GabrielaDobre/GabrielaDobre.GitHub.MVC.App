# GabrielaDobre.GitHub.MVC.App
-Aplicación Facturación-

¿Para qué sirve esta aplicación?

Esta aplicación nos permite crear facturas sencillas para nuestros clientes en base a los productos que compren. Nos permite añadir el tipo de IVA, y descuentos (en caso que los haya). Una vez hayamos terminado la factura y calculemos el total, se crea un archivo .txt con los datos del cliente (Nombre de la empresa, CIF y dirección), así como la denominación del producto y el total de la compra.


#Imágenes de la interfaz:

![Captura de pantalla 2025-03-04 101201](https://github.com/user-attachments/assets/ad8bf9ac-da1d-4668-b9f9-49d7c3c7f247)
![Captura de pantalla 2025-03-04 101145](https://github.com/user-attachments/assets/2807e665-9cc2-4dcd-8a7a-c4cbf10608e7)
![Captura de pantalla 2025-03-04 101137](https://github.com/user-attachments/assets/b3fcb636-9502-4422-9842-19a260074e74)
![Captura de pantalla 2025-03-04 100936](https://github.com/user-attachments/assets/542de83f-0444-44a0-941e-99d0a1269413)


Al abrir la aplicación tenemos dos menús desplegables para escoger el cliente y otro menú desplegable para escoger el producto. En el momento que clicamos sobre el cliente, directamente los campos de CIF y dirección se cumplimentarán; así como el producto, en cuanto lo escojamos, el apartado de precio, se auto cumplimentará. De forma manual podremos indicar si se aplica un descuento al producto y el tipo de IVA. Una vez tengamos todo esto listo, clicamos sobre el botón "calcular total" y nos aparecerá un mensaje que nos indicará que la factura se ha generado correctamente. Ya tendremos nuestra factura lista.

¿Cómo se ha construido esta aplicación?

·Está desarrollada en entorno Eclipse con Java 8. 

·Esta aplicación sigue el desarrollo MVC -  Modelo Vista Controlador.

·Consta de cuatro paquetes, un paquete que contiene la clase principal (main) y los paquetes restantes contienen las clases correspondientes al Modelo - Vista - Controlador. 

·Consta de cinco clases:

-La clase main, donde se ejecuta el programa.

-Dos clases que pertenecen al paquete "modelo", la clase encargada de gestionar la conexión con la base de datos; y la clase que maneja la lógica de cálculo y carga los datos de la base de datos.

-Una clase en el paquete "vista", encargada de representar el aspecto de la aplicación (parte visual).

-Y una clase que pertenece al paquete "controlador", encargada de manejar la interacción entre la vista y el modelo.

    
·A través de Javax Swing se han construido los paneles, los menús y los botones. Se han diseñado el tipo de fuente, los colores, los fondos de los menús y los botones.

·La aplicación se conecta con una base de datos MySQL, que consta de dos tablas diferentes (productos y empresas) alojada en phpMyAdmin.

·Se conecta en local host a través de Xampp Controller Panel.

#Imágenes de la base datos:

![Captura de pantalla 2025-03-04 104631](https://github.com/user-attachments/assets/26251efe-4f17-477a-b79f-b9ccf4915f1d)

![Captura de pantalla 2025-03-04 104549](https://github.com/user-attachments/assets/c0cbc1a8-a537-4bdf-b84f-29aea408f872)

