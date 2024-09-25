package Eje1Part2;

public class Vehiculo {
    Double velocidad;

    // Constructor de la clase Vehiculo
    Vehiculo() {
        this.velocidad = 0.0;
    }

    // Método para incrementar velocidad, demostración de overloading
    void incrementarVelocidad(int incremento) {
        velocidad += incremento;
    }

    // Sobrecarga del método incrementarVelocidad para diferentes tipos de datos
    void incrementarVelocidad(double incremento) {
        velocidad += (int) incremento;
    }

    // Método para mostrar la velocidad, demostración de overriding
    void mostrarVelocidad() {
        System.out.println("Velocidad del vehículo: " + velocidad + " km/h");
    }
}

// Clase subclase
class Automovil extends Vehiculo {
    String modelo;

    // Constructor de la clase Automovil
    Automovil(String modelo) {
        super(); // Llama al constructor de la superclase Vehiculo
        this.modelo = modelo;
    }

    // Sobrescritura del método mostrarVelocidad
    @Override
    void mostrarVelocidad() {
        super.mostrarVelocidad(); // Llamada al método mostrarVelocidad de la superclase
        System.out.println("El modelo del automóvil es: " + modelo);
    }

    // Sobrecarga del método incrementarVelocidad específica para Automovil
    void incrementarVelocidad(int incremento, boolean turbo) {
        if (turbo) {
            velocidad += 2 * incremento; // Incremento doble si el turbo está activado
        } else {
            super.incrementarVelocidad(incremento); // Llama al método de la superclase
        }
    }
}
