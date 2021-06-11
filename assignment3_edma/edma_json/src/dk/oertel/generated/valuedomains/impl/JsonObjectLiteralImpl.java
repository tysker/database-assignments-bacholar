package dk.oertel.generated.valuedomains.impl;

import dk.oertel.generated.valuedomains.JsonObjectLiteral;
import dk.oertel.generated.valuedomains.Member;
import dk.oertel.generated.valuedomains.external.EDMA_ExternalConstraints;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.UnsupportedOperationException;
import java.util.Iterator;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * The implementation of JsonObjectLiteral
 */
public class JsonObjectLiteralImpl extends JsonObjectLiteral implements IValueInstance
{
    private int edma_hash;
    private Object[] value;



    /**
     * Check if a value is valid
     * @param value  The value to validate
     */
    public static void edma_validate(Object value) throws InvalidValueException
    {
        edma_domain.validate(value, EDMA_ExternalConstraints.instance);
    }

    /**
     * create value without checking
     * @param value  The value to check and create
     * @return       <tt>true</tt> The new created value
     */
    public static Object edma_create(Object value)
    {
        return edma_domain.newValue(value);
    }

    /**
     * Constructor
     * @param o  The Object that represents this list value
     */
    public JsonObjectLiteralImpl(Object o)
    {
        edma_hash = 0;
        value = (Object[]) o;
    }

    /**
     * Gets the value domain for this value instance
     * @return  The value domain for this value instance
     */
    public IMetaValueDomain edma_getDomain()
    {
        return edma_domain;
    }

    /**
     * Access to the general Object value
     * @return  The value as a general Object
     */
    public Object edma_getValue()
    {
        return value;
    }

    /**
     * Returns <tt>true</tt> if this value equals the given value
     * @param o  Object to test equality with
     * @return   <tt>true</tt> if this value equals the given value
     */
    public boolean equals(Object o)
    {
        if(!(o instanceof IValueInstance)) return false;
        IValueInstance inst = (IValueInstance) o;
        if(6 != inst.edma_getDomain().getIndex()) return false;
        return edma_domain.valueEqual(value, inst.edma_getValue());
    }

    /**
     * Gets the value hash for this value instance
     * @return  The hash for this value instance
     */
    public int hashCode()
    {
        if(edma_hash == 0) edma_hash = edma_domain.valueHashCode(value);
        return edma_hash;
    }

    /**
     * Returns this value instance as a string
     * @return  this value instance as a string
     */
    public String toString()
    {
        return edma_domain.valueToString(value);
    }

    /**
     * Compare this JsonObjectLiteral to another JsonObjectLiteral
     * @param jsonObjectLiteral  The JsonObjectLiteral to compare with
     * @return                   A negative integer, zero, or a positive
     *                           integer as this JsonObjectLiteral is less than,
     *                           equal to, or greater than the specified
     *                           JsonObjectLiteral
     */
    public int compareTo(JsonObjectLiteral jsonObjectLiteral)
    {
        return edma_domain.valueCompare(value, ((JsonObjectLiteralImpl) jsonObjectLiteral).value);
    }

    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public void toStream(DataOutput out) throws IOException
    {
        edma_domain.writeValue(((IValueInstance) this).edma_getValue(), out);
    }

    /**
     * Returns an iterator for this list
     * @return  an iterator for this list
     */
    public Iterator<Member> iterator()
    {
        return new JsonObjectLiteralIterator();
    }

    /**
     * Returns the size of this list
     * @return  the size of this list
     */
    public int size()
    {
        return value.length;
    }

    /**
     * Returns the element on a given index in this list
     * @param index  The index of the element to be returned
     * @return       the element on the given index in this list
     */
    public Member get(int index)
    {
        return new MemberImpl(value[index]);
    }


    /**
     * 
     */
    public class JsonObjectLiteralIterator implements Iterator<Member>
    {
        private int pos;



        /**
         * Constructor
         */
        public JsonObjectLiteralIterator()
        {
            pos = 0;
        }

        /**
         * Returns true if there are more elements in this iterator
         * @return  true if there are more elements in this iterator
         */
        public boolean hasNext()
        {
            return pos < value.length;
        }

        /**
         * returns the next element from this iterator
         * @return  the next element in this iterator
         */
        public Member next()
        {
            return new MemberImpl(value[pos++]);
        }

        /**
         * This operation is not supported, because the list is immutable
         */
        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }

}
