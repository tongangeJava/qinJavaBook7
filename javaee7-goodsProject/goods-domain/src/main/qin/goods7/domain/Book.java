package qin.goods7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book implements SuperEntity7<Short>
{
    private Short id;

    @Id
    @GeneratedValue
    @Override
    public Short getId()
    {
        return id;
    }

    @Override
    public void setId(Short id)
    {
        this.id = id;
    }
}