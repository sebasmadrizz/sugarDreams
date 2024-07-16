
package com.sugarDreams.domain;
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table (name="personalizar")
public class Personalizar implements Serializable {
    private static  final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_queque")
    private Long idQueque;
    private String rutaImagen;
    private String relleno;
    private String sabor;
    private String cobertura;
    private String tamaño;
    private String altura; 
    private String descripcion;
    
}
