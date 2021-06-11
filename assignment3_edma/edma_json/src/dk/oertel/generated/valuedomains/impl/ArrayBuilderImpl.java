package dk.oertel.generated.valuedomains.impl;

import dk.oertel.generated.valuedomains.Array;
import dk.oertel.generated.valuedomains.Array.ArrayBuilder;
import dk.oertel.generated.valuedomains.JsonObject;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class ArrayBuilderImpl implements ArrayBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public ArrayBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param jsonObject  The element to be added to the list
     * @return            An interface to the builder for chaining method calls
     */
    public ArrayBuilder add(JsonObject jsonObject)
    {
        if(jsonObject == null) throw new NullPointerException();
        valueList.add(((IValueInstance) jsonObject).edma_getValue());
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public Array end()
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        return new ArrayImpl(ArrayImpl.edma_create(res));
    }
}
