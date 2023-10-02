package com.eduardo.facturadigital.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;


@Entity
@Getter  //este es un metodo de lombok el cual hace que el codigo sea suy corto sin necesidad de hacer los Getter
@Setter//este es un metodo de lombok el cual hace que el codigo sea suy corto sin necesidad de hacer los Setter
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    @Email
    private String email;

    @NotNull
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Factura> facturas;

    private String foto;

    public void addFactura(Factura factura){
        facturas.add(factura);
    }

    public static long getSerialversionuid(){
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    private static final long serialVersionUID = 1L;
}
