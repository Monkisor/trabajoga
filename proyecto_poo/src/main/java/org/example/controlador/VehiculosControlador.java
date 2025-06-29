package org.example.controlador;

import org.example.models.Vehiculo;
import org.example.servicio.VehiculoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VehiculosControlador {

    @Autowired
    private VehiculoServicio servicio;

    // Mostrar lista de vehículos
    @GetMapping("/vehiculos/index")
    public String index(Model model) {
        model.addAttribute("vehiculos", servicio.listarVehiculos());
        return "vehiculo/index";
    }

    // Mostrar formulario para crear vehículo
    @GetMapping("/vehiculos/create")
    public String create(Model model) {
        Vehiculo vehiculo = new Vehiculo();
        model.addAttribute("vehiculo", vehiculo);
        return "vehiculo/create";
    }

    // Guardar nuevo vehículo
    @PostMapping("/vehiculos/store")
    public String store(@ModelAttribute("vehiculo") Vehiculo vehiculo) {
        servicio.agregarVehiculo(vehiculo);
        return "redirect:/vehiculos/index";
    }

    // Mostrar formulario para editar vehículo
    @GetMapping("/vehiculos/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("vehiculo", servicio.obtenerVehiculoPorId(id));
        return "vehiculo/edit";
    }

    // Actualizar datos del vehículo
    @PostMapping("/vehiculos/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute("vehiculo") Vehiculo vehiculo) {
        Vehiculo v = new Vehiculo();
        v.setId(id);
        v.setMarca(vehiculo.getMarca());
        v.setModelo(vehiculo.getModelo());
        v.setAnio(vehiculo.getAnio());
        v.setPrecio(vehiculo.getPrecio());
        v.setDisponible(vehiculo.getDisponible());

        servicio.actualizarVehiculo(v);

        return "redirect:/vehiculos/index";
    }

    // Eliminar vehículo
    @GetMapping("/vehiculos/delete/{id}")
    public String delete(@PathVariable Long id) {
        servicio.eliminarVehiculo(id);
        return "redirect:/vehiculos/index";
    }

    @GetMapping("/vehiculos/buscar")
    public String buscar(@RequestParam("marca") String marca, Model model) {
        model.addAttribute("vehiculos", servicio.buscarPorMarca(marca));
        model.addAttribute("marca", marca);
        return "vehiculo/index";
    }


}
