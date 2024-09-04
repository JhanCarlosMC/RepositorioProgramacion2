package co.edu.uniquindio.patronesCreacionales.prototype.ejemploFiguras.services;

/**
 * Interfaz que define el método para clonar objetos.
 * Todas las clases que implementen esta interfaz deben
 * proporcionar una implementación del método clonar().
 */
public interface IPrototype extends Cloneable{

    IPrototype clone();
}
