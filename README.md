# Proyecto Tienda Juguetes - Patrón MVC

Aplicación de escritorio para la gestión de un inventario de una tienda de juguetes, desarrollada en **Java** y utilizando el patrón de diseño arquitectónico **Modelo-Vista-Controlador (MVC)**, con persistencia de datos en **MySQL**.

## 🚀 Características
* Gestión del inventario de juguetes (Crear, Leer, Actualizar, Eliminar).
* Interfaz Gráfica de Usuario (GUI) construida con Java Swing.
* Conexión robusta a base de datos relacional MySQL utilizando JDBC.
* Código escalable, organizado y desacoplado gracias a la arquitectura MVC.

## 📁 Estructura del Proyecto

El proyecto está dividido en los siguientes paquetes principales, respetando el patrón MVC:
* **`modelos`**: Contiene la clase `conexion_db` para manejar la conexión con MySQL, las entidades del dominio y los Data Access Objects (DAO) como `productoDAO` para las operaciones CRUD.
* **`vista`**: Interfaces gráficas (formularios y listas) creadas con componentes Swing (`Producto_vista`, `Formulario_producto`, `Lista_producto`).
* **`controlador`**: Contiene la clase `controlador` que escucha los eventos de la vista y actualiza o consulta el modelo, manteniendo ambas partes sincronizadas.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java
* **Base de Datos:** MySQL
* **Driver:** MySQL Connector/J (JDBC)
* **IDE:** NetBeans / VS Code / IntelliJ IDEA

## ⚙️ Instalación y Configuración

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/chaustrexp/Patrones.git
   ```

2. **Configurar la Base de Datos:**
   * Abre tu gestor de base de datos MySQL (por ejemplo, phpMyAdmin o MySQL Workbench).
   * Ejecuta el script SQL incluido en la raíz del repositorio (`tienda.sql`) para crear la base de datos y la tabla correspondiente.
   * Verifica o ajusta las credenciales de conexión en la clase `Conexion/Conexion.java` o `modelos/conexion_db.java` según la configuración local de tu MySQL (usuario, contraseña y puerto).

3. **Ejecutar el proyecto:**
   * Abre el proyecto desde tu IDE preferido (la carpeta `Tienda`).
   * Asegúrate de tener referenciado el `.jar` de MySQL (incluido en `Tienda/lib/`).
   * Ejecuta la clase principal (`Tienda.java` o `tienda/Tienda.java`) para lanzar la aplicación.
