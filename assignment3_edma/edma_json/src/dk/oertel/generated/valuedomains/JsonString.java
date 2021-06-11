package dk.oertel.generated.valuedomains;

import dk.oertel.generated.edma_json;
import dk.oertel.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.oertel.generated.valuedomains.impl.JsonStringImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: JsonString
 */
public abstract class JsonString implements Comparable<JsonString>
{
    protected static final IMetaValueDomain edma_domain = edma_json.environment.getValueDomainDefinitions().getValueDomain(1);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The JsonString from the terminal
     */
    public static JsonString fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new JsonStringImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The JsonString from the string representation
     */
    public static JsonString fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new JsonStringImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The JsonString read from the stream
     */
    public static JsonString fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new JsonStringImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The JsonString read from the stream
     */
    public static JsonString fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new JsonStringImpl(res);
    }

    /**
     * Call this method to create a new JsonString value. 
     * @param value  The value of the JsonString to be created.
     * @return       The newly created JsonString value
     */
    public static JsonString create(String value) throws InvalidValueException
    {
        JsonStringImpl.edma_validate(value);
        return new JsonStringImpl(JsonStringImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid JsonString
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid JsonString
     */
    public static boolean isValidJsonString(String value)
    {
        try
        {
            JsonStringImpl.edma_validate(value);
        }
        catch(InvalidValueException e)
        {
            return false;
        }
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the String value that is stored in this JsonString
     * @return  The String value stored in this JsonString
     */
    public abstract String value();
}
