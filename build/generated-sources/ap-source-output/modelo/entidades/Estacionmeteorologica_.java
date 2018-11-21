package modelo.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Hojavisitasestaciones;
import modelo.entidades.Lecturaestaciones;
import modelo.entidades.Municipios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-14T10:58:16")
@StaticMetamodel(Estacionmeteorologica.class)
public class Estacionmeteorologica_ { 

    public static volatile CollectionAttribute<Estacionmeteorologica, Lecturaestaciones> lecturaestacionesCollection;
    public static volatile SingularAttribute<Estacionmeteorologica, String> codigoestacion;
    public static volatile CollectionAttribute<Estacionmeteorologica, Hojavisitasestaciones> hojavisitasestacionesCollection;
    public static volatile SingularAttribute<Estacionmeteorologica, Municipios> idmunicipio;
    public static volatile SingularAttribute<Estacionmeteorologica, Integer> idestacion;

}