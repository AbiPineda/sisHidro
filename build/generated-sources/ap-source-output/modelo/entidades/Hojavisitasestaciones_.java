package modelo.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Estacionmeteorologica;
import modelo.entidades.Visitantes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-21T10:46:20")
@StaticMetamodel(Hojavisitasestaciones.class)
public class Hojavisitasestaciones_ { 

    public static volatile SingularAttribute<Hojavisitasestaciones, Visitantes> idvisitante;
    public static volatile SingularAttribute<Hojavisitasestaciones, Integer> idhojavisitaestaciones;
    public static volatile SingularAttribute<Hojavisitasestaciones, Date> fechavisita;
    public static volatile SingularAttribute<Hojavisitasestaciones, String> observacion;
    public static volatile SingularAttribute<Hojavisitasestaciones, Estacionmeteorologica> idestacion;

}