package com.eduardo.facturadigital.models.dao;

import com.eduardo.facturadigital.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao  extends CrudRepository<Factura, Long> {
}
