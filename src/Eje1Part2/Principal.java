package Eje1Part2;

public class Principal {
    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Toyota");
        miAuto.incrementarVelocidad(10); // Uso del método sobrecargado de la superclase
        miAuto.incrementarVelocidad(5.5); // Uso del método sobrecargado de la superclase con double
        miAuto.incrementarVelocidad(20, true); // Uso del método sobrecargado en la subclase
        miAuto.mostrarVelocidad(); // Muestra la velocidad y el modelo del automóvil
    }
}
