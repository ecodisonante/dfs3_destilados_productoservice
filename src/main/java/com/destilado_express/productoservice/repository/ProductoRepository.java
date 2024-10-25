package com.ecodisonante.destilado_express.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecodisonante.destilado_express.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // buscar solo productos disponibles (para cliente)
    List<Producto> findByDisponible(Boolean disponible);
}
