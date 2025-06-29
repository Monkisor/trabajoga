package org.example.repositorio;


import org.example.models.Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VehiculoRepositorio extends CrudRepository<Vehiculo, Long> {
    List<Vehiculo> findByMarcaContainingIgnoreCase(String marca);
}
