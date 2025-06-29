package org.example.servicio;

import org.example.models.Vehiculo;
import org.example.repositorio.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class VehiculoServicio implements InterfaceVehiculoServicio {

    @Autowired
    private VehiculoRepositorio repositorio;

    @Override
    public List<Vehiculo> listarVehiculos() {
        return (List<Vehiculo>) repositorio.findAll();
    }

    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        return repositorio.save(vehiculo);
    }

    @Override
    public Vehiculo obtenerVehiculoPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public Vehiculo actualizarVehiculo(Vehiculo vehiculo) {
        return repositorio.save(vehiculo);
    }

    @Override
    public void eliminarVehiculo(Long id) {
        repositorio.deleteById(id);
    }

    //@Override
    //public List<Vehiculo> buscarPorMarca(String marca) {
      //  return Collections.emptyList();
    //}

    @Override
    public List<Vehiculo> buscarPorMarca(String marca) {
        return repositorio.findByMarcaContainingIgnoreCase(marca);
    }



}
