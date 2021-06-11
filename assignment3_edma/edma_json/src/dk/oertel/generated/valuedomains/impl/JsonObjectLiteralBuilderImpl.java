package dk.oertel.generated.valuedomains.impl;

import dk.oertel.generated.valuedomains.JsonObjectLiteral;
import dk.oertel.generated.valuedomains.JsonObjectLiteral.JsonObjectLiteralBuilder;
import dk.oertel.generated.valuedomains.Member;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class JsonObjectLiteralBuilderImpl implements JsonObjectLiteralBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public JsonObjectLiteralBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param member  The element to be added to the list
     * @return        An interface to the builder for chaining method calls
     */
    public JsonObjectLiteralBuilder add(Member member)
    {
        if(member == null) throw new NullPointerException();
        valueList.add(((IValueInstance) member).edma_getValue());
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public JsonObjectLiteral end()
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        return new JsonObjectLiteralImpl(JsonObjectLiteralImpl.edma_create(res));
    }
}
