package ejerciciosPOO.Division;
import java.util.Scanner;//Esta línea importa la clase Scanner del paquete java.util, que permite la lectura de datos de entrada del usuario desde la consola.
public class MainDivision {//Esto declara una clase pública llamada MainDivision. Todo el código del programa estará contenido dentro de esta clase.
    public static void main(String[] args) {//Este es el punto de entrada principal del programa. El método main es el punto de inicio de ejecución de cualquier aplicación Java.
        Division division1 = new Division();//Aquí se crea un nuevo objeto de la clase Division llamado division1. Este objeto se utilizará para realizar operaciones de división.
        int a,e;//Se declaran dos variables enteras a y e que se utilizarán para almacenar los números ingresados por el usuario.
        
        Scanner op = new Scanner(System.in);//Se crea un objeto de la clase Scanner llamado op. Este objeto se utilizará para leer la entrada del usuario desde la consola.
        System.out.print("Ingresa el primer numero: ");//Aquí se muestra un mensaje solicitando al usuario que ingrese el primer número. Luego, se utiliza el método nextInt() del objeto Scanner para leer y almacenar el número ingresado por el usuario en la variable a.
        a = op.nextInt();
        System.out.print("Ingresa el segundo numero: ");//Similar al paso anterior, se muestra un mensaje solicitando al usuario que ingrese el segundo número, y luego se almacena en la variable e.
        e = op.nextInt();

        division1.setNum1(a);//Se utilizan los métodos setNum1() y setNum2() del objeto division1 para establecer los valores de los números ingresados por el usuario.
        division1.setNum2(e);

        division1.MostrarResultado();//Finalmente, se llama al método MostrarResultado() del objeto division1 para mostrar el resultado de la división de los dos números ingresados por el usuario.

    }
}