package modelo.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Municipios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-21T10:46:20")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, Integer> iddepartamento;
    public static volatile CollectionAttribute<Departamentos, Municipios> municipiosCollection;
    public static volatile SingularAttribute<Departamentos, String> nombredepartamento;

}