package modelo.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Departamentos;
import modelo.entidades.Estacionmeteorologica;
import modelo.entidades.Pozos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-21T10:46:20")
@StaticMetamodel(Municipios.class)
public class Municipios_ { 

    public static volatile CollectionAttribute<Municipios, Pozos> pozosCollection;
    public static volatile SingularAttribute<Municipios, Integer> idmunicipio;
    public static volatile SingularAttribute<Municipios, Departamentos> iddepartamento;
    public static volatile SingularAttribute<Municipios, String> nombremunicipio;
    public static volatile CollectionAttribute<Municipios, Estacionmeteorologica> estacionmeteorologicaCollection;

}