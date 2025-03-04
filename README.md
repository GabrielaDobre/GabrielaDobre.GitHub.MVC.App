# GabrielaDobre.GitHub.MVC.App
-Aplicación Facturación-

¿Para qué sirve esta aplicación?

Esta aplicación nos permite crear facturas sencillas para nuestros clientes en base a los productos que compren. Nos permite añadir el tipo de IVA, y descuentos (en caso que los haya). Una vez hayamos terminado la factura y calculemos el total, se crea un archivo .txt con los datos del cliente (Nombre de la empresa, CIF y dirección), así como la denominación del producto y el total de la compra.

#Imágenes de la interfaz:

![Captura de pantalla 2025-03-04 101201](https://github.com/user-attachments/assets/9e632ab3-1294-426d-b02b-e9472ded63a2)
![Captura de pantalla 2025-03-04 101145](https://github.com/user-attachments/assets/b7f28464-82a3-4702-ae16-b71d9da5fb83)
![Captura de pantalla 2025-03-04 101137](https://github.com/user-attachments/assets/bbbd7cac-cb8c-42e1-b3a8-776c7ef94bd1)

Al abrir la aplicación tenemos dos menús desplegables para escoger el cliente y otro menú desplegable para escoger el producto. En el momento que clicamos sobre el cliente, directamente los campos de CIF y dirección se cumplimentarán; así como el producto, en cuanto lo escojamos, el apartado de precio, se auto cumplimentará. De forma manual podremos indicar si se aplica un descuento al producto y el tipo de IVA. Una vez tengamos todo esto listo, clicamos sobre el botón "calcular total" y nos aparecerá un mensaje que nos indicará que la factura se ha generado correctamente. Ya tendremos nuestra factura lista.

¿Cómo se ha construido esta aplicación?

·Está desarrollada en entorno Eclipse con Java 8. 

·Esta aplicación sigue el desarrollo MVC -  Modelo Vista Controlador.

·Consta de cuatro paquetes, un paquete que contiene la clase principal (main) y los paquetes restantes contienen las clases correspondientes al Modelo - Vista - Controlador. 

·Consta de cinco clases:

    - La clase main, donde se ejecuta el programa.
    - Dos clases que pertenecen al paquete "modelo", la clase encargada de gestionar la conexión con la base de datos; y la clase 
      que maneja la lógica de cálculo y carga los datos de la base de datos.
    - Una clase en el paquete "vista", encargada de representar el aspecto de la aplicación (parte visual).
    - Y una clase que pertenece al paquete "controlador", encargada de manejar la interacción entre la vista y el modelo.
    
·A través de Javax Swing se han construido los paneles, los menús y los botones. Se han diseñado el tipo de fuente, los colores, los fondos de los menús y los botones.

·La aplicación se conecta con una base de datos MySQL, que consta de dos tablas diferentes (productos y empresas) alojada en phpMyAdmin.

·Se conecta en local host a través de Xampp Controller Panel.

#Imágenes de la base datos:

![Captura de pantalla 2025-03-04 104631](https://github.com/user-attachments/assets/f2f4567a-8d25-4405-acc4-8e96ae2cdf37)

![Captura de pantalla 2025-03-04 104549](https://github.com/user-attachments/assets/69feec4c-9460-4a75-9975-53d514529068)
