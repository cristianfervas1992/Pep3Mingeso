package com.ordermeal1.entities;

import com.ordermeal1.entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-11T20:43:26")
@StaticMetamodel(Postre.class)
public class Postre_ { 

    public static volatile SingularAttribute<Postre, Double> posPrecio;
    public static volatile SingularAttribute<Postre, String> posNombre;
    public static volatile ListAttribute<Postre, Order1> order1List;
    public static volatile SingularAttribute<Postre, Integer> idPostre;

}