package com.ecodisonante.destilado_express.service;

import com.ecodisonante.destilado_express.model.Producto;
import java.util.List;

public interface ProductoService {

    public List<Producto> getAllProductos();

    public Producto getProductoById(Long id);

    public Producto crearProducto(Producto producto);

    public Producto actualizarProducto(Long id, Producto productoActualizado);

    public void eliminarProducto(Long id);
}
