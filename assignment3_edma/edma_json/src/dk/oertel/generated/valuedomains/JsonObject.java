package dk.oertel.generated.valuedomains;

import dk.oertel.generated.edma_json;
import dk.oertel.generated.valuedomains.Array;
import dk.oertel.generated.valuedomains.JsonBoolean;
import dk.oertel.generated.valuedomains.JsonNull;
import dk.oertel.generated.valuedomains.JsonNumber;
import dk.oertel.generated.valuedomains.JsonObjectLiteral;
import dk.oertel.generated.valuedomains.JsonString;
import dk.oertel.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.oertel.generated.valuedomains.impl.JsonObjectImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: JsonObject
 */
public abstract class JsonObject implements Comparable<JsonObject>
{
    protected static final IMetaValueDomain edma_domain = edma_json.environment.getValueDomainDefinitions().getValueDomain(5);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The JsonObject from the terminal
     */
    public static JsonObject fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new JsonObjectImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The JsonObject from the string representation
     */
    public static JsonObject fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new JsonObjectImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The JsonObject read from the stream
     */
    public static JsonObject fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new JsonObjectImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The JsonObject read from the stream
     */
    public static JsonObject fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new JsonObjectImpl(res);
    }

    /**
     * Creates a new JsonObject with the internal value domain JsonObjectLiteral
     * @param jsonObjectLiteral  The internal value that this JsonObject will
     *                           get
     * @return                   The created value
     */
    public static JsonObject create(JsonObjectLiteral jsonObjectLiteral)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 0;
        edma_pair[1] = ((IValueInstance) jsonObjectLiteral).edma_getValue();
        return new JsonObjectImpl(edma_pair);
    }

    /**
     * Creates a new JsonObject with the internal value domain Array
     * @param array  The internal value that this JsonObject will get
     * @return       The created value
     */
    public static JsonObject create(Array array)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 1;
        edma_pair[1] = ((IValueInstance) array).edma_getValue();
        return new JsonObjectImpl(edma_pair);
    }

    /**
     * Creates a new JsonObject with the internal value domain JsonString
     * @param jsonString  The internal value that this JsonObject will get
     * @return            The created value
     */
    public static JsonObject create(JsonString jsonString)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 2;
        edma_pair[1] = ((IValueInstance) jsonString).edma_getValue();
        return new JsonObjectImpl(edma_pair);
    }

    /**
     * Creates a new JsonObject with the internal value domain JsonNumber
     * @param jsonNumber  The internal value that this JsonObject will get
     * @return            The created value
     */
    public static JsonObject create(JsonNumber jsonNumber)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 3;
        edma_pair[1] = ((IValueInstance) jsonNumber).edma_getValue();
        return new JsonObjectImpl(edma_pair);
    }

    /**
     * Creates a new JsonObject with the internal value domain JsonBoolean
     * @param jsonBoolean  The internal value that this JsonObject will get
     * @return             The created value
     */
    public static JsonObject create(JsonBoolean jsonBoolean)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 4;
        edma_pair[1] = ((IValueInstance) jsonBoolean).edma_getValue();
        return new JsonObjectImpl(edma_pair);
    }

    /**
     * Creates a new JsonObject with the internal value domain JsonNull
     * @param jsonNull  The internal value that this JsonObject will get
     * @return          The created value
     */
    public static JsonObject create(JsonNull jsonNull)
    {
        Object[] edma_pair = new Object[2];
        edma_pair[0] = 5;
        edma_pair[1] = ((IValueInstance) jsonNull).edma_getValue();
        return new JsonObjectImpl(edma_pair);
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonObjectLiteral
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonObjectLiteral
     */
    public abstract boolean isJsonObjectLiteral();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * Array
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          Array
     */
    public abstract boolean isArray();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonString
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonString
     */
    public abstract boolean isJsonString();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonNumber
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonNumber
     */
    public abstract boolean isJsonNumber();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonBoolean
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonBoolean
     */
    public abstract boolean isJsonBoolean();

    /**
     * Returns <tt>true</tt> if this value is a value from the value domain
     * JsonNull
     * @return  <tt>true</tt> if this value is a value from the value domain
     *          JsonNull
     */
    public abstract boolean isJsonNull();

    /**
     * Returns this value as a value from the value domain JsonObjectLiteral or
     * throws an UnsupportedOperationException if this value is not from the
     * value domain JsonObjectLiteral
     * @return  This value as a value from the value domain JsonObjectLiteral
     */
    public abstract JsonObjectLiteral asJsonObjectLiteral();

    /**
     * Returns this value as a value from the value domain Array or throws an
     * UnsupportedOperationException if this value is not from the value domain
     * Array
     * @return  This value as a value from the value domain Array
     */
    public abstract Array asArray();

    /**
     * Returns this value as a value from the value domain JsonString or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain JsonString
     * @return  This value as a value from the value domain JsonString
     */
    public abstract JsonString asJsonString();

    /**
     * Returns this value as a value from the value domain JsonNumber or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain JsonNumber
     * @return  This value as a value from the value domain JsonNumber
     */
    public abstract JsonNumber asJsonNumber();

    /**
     * Returns this value as a value from the value domain JsonBoolean or
     * throws an UnsupportedOperationException if this value is not from the
     * value domain JsonBoolean
     * @return  This value as a value from the value domain JsonBoolean
     */
    public abstract JsonBoolean asJsonBoolean();

    /**
     * Returns this value as a value from the value domain JsonNull or throws
     * an UnsupportedOperationException if this value is not from the value
     * domain JsonNull
     * @return  This value as a value from the value domain JsonNull
     */
    public abstract JsonNull asJsonNull();
}
