package modelo.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Pozos;
import modelo.entidades.Visitantes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-14T10:58:16")
@StaticMetamodel(Hojavisitaspozos.class)
public class Hojavisitaspozos_ { 

    public static volatile SingularAttribute<Hojavisitaspozos, Visitantes> idvisitante;
    public static volatile SingularAttribute<Hojavisitaspozos, BigDecimal> level;
    public static volatile SingularAttribute<Hojavisitaspozos, Date> fechavisita;
    public static volatile SingularAttribute<Hojavisitaspozos, Pozos> idpozo;
    public static volatile SingularAttribute<Hojavisitaspozos, String> observacion;
    public static volatile SingularAttribute<Hojavisitaspozos, Integer> idhojavisitapozos;

}