Requisitos

Java JDK 8 o superior

NetBeans IDE

Instalación y Ejecución

1. Clonar o descargar el proyecto

Si tienes Git instalado, ejecuta:

git clone https://github.com/fmendie/pacientes.git

O descarga el código fuente manualmente.

2. Abrir en NetBeans

Abre NetBeans.

Ve a "File" > "Open Project".

Selecciona la carpeta del proyecto y haz clic en "Open".

3. Ejecutar el Proyecto

En la ventana Projects, haz clic derecho en el archivo Main.java.

Selecciona "Run File".

Sigue las instrucciones en la consola para registrar, buscar, eliminar o listar pacientes.

Funcionalidades

Registrar pacientes (ID único, nombre, edad, clínica).

Buscar pacientes por ID.

Eliminar pacientes del sistema.

Listar todos los pacientes registrados.

Estructura del Código

Paciente.java: Representa a un paciente.

ListaPacientes.java: Implementa una lista enlazada para almacenar pacientes.

Main.java: Contiene la interfaz de usuario en consola.

Notas

Si intentas registrar un paciente con un ID ya existente, el sistema rechazará el ingreso.

Se debe ingresar un ID válido al buscar o eliminar un paciente.