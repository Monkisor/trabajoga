package org.example.servicio;

import org.example.models.Vehiculo;

import java.util.List;

public interface InterfaceVehiculoServicio {
    List<Vehiculo> listarVehiculos();
    Vehiculo agregarVehiculo(Vehiculo vehiculo);
    Vehiculo obtenerVehiculoPorId(Long id);
    Vehiculo actualizarVehiculo(Vehiculo vehiculo);
    void eliminarVehiculo(Long id);
    List<Vehiculo> buscarPorMarca(String marca);

}
