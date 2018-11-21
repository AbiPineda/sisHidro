package modelo.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Pozos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-21T10:46:20")
@StaticMetamodel(Lecturapozos.class)
public class Lecturapozos_ { 

    public static volatile SingularAttribute<Lecturapozos, Date> date;
    public static volatile SingularAttribute<Lecturapozos, Integer> idlecturapozo;
    public static volatile SingularAttribute<Lecturapozos, BigDecimal> level;
    public static volatile SingularAttribute<Lecturapozos, String> ms;
    public static volatile SingularAttribute<Lecturapozos, BigDecimal> temperature;
    public static volatile SingularAttribute<Lecturapozos, Date> time;
    public static volatile SingularAttribute<Lecturapozos, Pozos> idpozo;

}