package dk.oertel.generated.valuedomains.impl;

import dk.oertel.generated.valuedomains.Array;
import dk.oertel.generated.valuedomains.JsonBoolean;
import dk.oertel.generated.valuedomains.JsonNull;
import dk.oertel.generated.valuedomains.JsonNumber;
import dk.oertel.generated.valuedomains.JsonObject;
import dk.oertel.generated.valuedomains.JsonObjectLiteral;
import dk.oertel.generated.valuedomains.JsonString;
import dk.oertel.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.oertel.generated.valuedomains.impl.ArrayImpl;
import dk.oertel.generated.valuedomains.impl.JsonBooleanImpl;
import dk.oertel.generated.valuedomains.impl.JsonNullImpl;
import dk.oertel.generated.valuedomains.impl.JsonNumberImpl;
import dk.oertel.generated.valuedomains.impl.JsonObjectLiteralImpl;
import dk.oertel.generated.valuedomains.impl.JsonStringImpl;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * The implementation of JsonObject
 */
public class JsonObjectImpl extends JsonObject implements IValueInstance
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
     * @param o  The Object that represents this OneOf value
     */
    public JsonObjectImpl(Object o)
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
        if(5 != inst.edma_getDomain().getIndex()) return false;
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
     * Compare this JsonObject to another JsonObject
     * @param jsonObject  The JsonObject to compare with
     * @return            A negative integer, zero, or a positive integer as
     *                    this JsonObject is less than, equal to, or greater
     *                    than the specified JsonObject
     */
    public int compareTo(JsonObject jsonObject)
    {
        return edma_domain.valueCompare(value, ((JsonObjectImpl) jsonObject).value);
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
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonObjectLiteral
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonObjectLiteral
     */
    public boolean isJsonObjectLiteral()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 0);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * Array
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          Array
     */
    public boolean isArray()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 1);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonString
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonString
     */
    public boolean isJsonString()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 2);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonNumber
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonNumber
     */
    public boolean isJsonNumber()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 3);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonBoolean
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonBoolean
     */
    public boolean isJsonBoolean()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 4);
    }

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonNull
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonNull
     */
    public boolean isJsonNull()
    {
        Integer index = (Integer) value[0];
        return (index.intValue() == 5);
    }

    /**
     * Returns this value as a value from the value domain JsonObjectLiteral or
     * throws an UnsupportedOperationException if this value is not from the
     * value domain JsonObjectLiteral
     * @return  This value as a value from the value domain JsonObjectLiteral
     */
    public JsonObjectLiteral asJsonObjectLiteral()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 0) throw new UnsupportedOperationException();
        return new JsonObjectLiteralImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain Array or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * Array
     * @return  This value as a value from the value domain Array
     */
    public Array asArray()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 1) throw new UnsupportedOperationException();
        return new ArrayImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain JsonString or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain JsonString
     * @return  This value as a value from the value domain JsonString
     */
    public JsonString asJsonString()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 2) throw new UnsupportedOperationException();
        return new JsonStringImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain JsonNumber or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain JsonNumber
     * @return  This value as a value from the value domain JsonNumber
     */
    public JsonNumber asJsonNumber()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 3) throw new UnsupportedOperationException();
        return new JsonNumberImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain JsonBoolean or
     * throws an UnsupportedOperationException if this value is not from the
     * value domain JsonBoolean
     * @return  This value as a value from the value domain JsonBoolean
     */
    public JsonBoolean asJsonBoolean()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 4) throw new UnsupportedOperationException();
        return new JsonBooleanImpl(value[1]);
    }

    /**
     * Returns this value as a value from the value domain JsonNull or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain JsonNull
     * @return  This value as a value from the value domain JsonNull
     */
    public JsonNull asJsonNull()
    {
        Integer index = (Integer) value[0];
        if(index.intValue() != 5) throw new UnsupportedOperationException();
        return new JsonNullImpl(value[1]);
    }
}
