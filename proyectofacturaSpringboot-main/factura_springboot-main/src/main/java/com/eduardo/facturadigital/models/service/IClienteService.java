package com.eduardo.facturadigital.models.service;

import com.eduardo.facturadigital.models.entity.Cliente;
import com.eduardo.facturadigital.models.entity.Factura;
import com.eduardo.facturadigital.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    List<Cliente> findAll();
    Page<Cliente> findAll(Pageable pageable);
    void save(Cliente cliente);
    Cliente findOne(Long id);
    void delete(Long id);
    List<Producto> findByNombre(String nombre);
    void saveFactura(Factura factura);
    Producto findProductoById(Long id);
    Factura findFacturaById(Long id);
    void deleteFactura(Long id);
}
