package modelo.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Pozos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-14T10:58:16")
@StaticMetamodel(Propietario.class)
public class Propietario_ { 

    public static volatile SingularAttribute<Propietario, String> direccionpropietario;
    public static volatile SingularAttribute<Propietario, String> telefonofijopropietario;
    public static volatile SingularAttribute<Propietario, String> apellidopropietario;
    public static volatile CollectionAttribute<Propietario, Pozos> pozosCollection;
    public static volatile SingularAttribute<Propietario, String> nombrepropietario;
    public static volatile SingularAttribute<Propietario, String> telefonocelularpropietario;
    public static volatile SingularAttribute<Propietario, Integer> idpropietario;
    public static volatile SingularAttribute<Propietario, String> sexopropietario;

}