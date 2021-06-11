package dk.oertel.generated.valuedomains.impl;

import dk.oertel.generated.valuedomains.JsonObject;
import dk.oertel.generated.valuedomains.Member;
import dk.oertel.generated.valuedomains.Member.MemberBuilderName;
import dk.oertel.generated.valuedomains.Member.MemberBuilderValue;
import dk.oertel.generated.valuedomains.Name;
import dk.oertel.generated.valuedomains.impl.NameImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class MemberBuilderImpl implements MemberBuilderName, MemberBuilderValue
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public MemberBuilderImpl()
    {
        edma_value = new Object[2];
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the value field
     */
    public MemberBuilderValue name(Name name)
    {
        if(name == null) throw new NullPointerException("The field name in Member may not be null");
        edma_value[0] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the value field
     */
    public MemberBuilderValue name(String name) throws InvalidValueException
    {
        if(name != null) NameImpl.edma_validate(name);
        if(name == null) throw new NullPointerException();
        edma_value[0] = NameImpl.edma_create(name);
        return this;
    }

    /**
     * sets the value field.
     * @param value  The value to assign to the value field
     * @return       The created Member value
     */
    public Member value(JsonObject value)
    {
        if(value == null) throw new NullPointerException("The field value in Member may not be null");
        edma_value[1] = ((IValueInstance) value).edma_getValue();
        return new MemberImpl(MemberImpl.edma_create(edma_value));
    }
}
