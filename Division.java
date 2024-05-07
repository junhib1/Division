package ejerciciosPOO.Division;
class Division{// Definición de la clase Division
    int num1, num2; // Declaración de variables de instancia num1 y num2 de tipo entero
    
    Division(){// Constructor por defecto
    }
    
    public void MostrarResultado(){// Método para mostrar el resultado de la división
        System.out.println("El resultado es " + (this.num1 / this.num2)); // Imprime el resultado de la división de num1 entre num2
    }
    
    public int getNum1() {// Método para obtener el valor de num1
        return num1; // Retorna el valor de num1
    }
    
    public void setNum1(int num1) {// Método para establecer el valor de num1
        this.num1 = num1; // Establece el valor de num1 con el valor proporcionado
    }
    
    public int getNum2() {// Método para obtener el valor de num2
        return num2; // Retorna el valor de num2
    }
    
    public void setNum2(int num2) {// Método para establecer el valor de num2
        this.num2 = num2; // Establece el valor de num2 con el valor proporcionado
    }
    
    @Override// Método toString para representación de cadena de objetos de la clase Division
    public String toString() {
        return "Division [num1=" + num1 + ", num2=" + num2 + "]"; // Retorna una cadena que representa el estado actual del objeto Division
    }
        
}
