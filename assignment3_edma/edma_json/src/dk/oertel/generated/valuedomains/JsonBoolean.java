package dk.oertel.generated.valuedomains;

import dk.oertel.generated.edma_json;
import dk.oertel.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.oertel.generated.valuedomains.impl.JsonBooleanImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: JsonBoolean
 */
public abstract class JsonBoolean implements Comparable<JsonBoolean>
{
    protected static final IMetaValueDomain edma_domain = edma_json.environment.getValueDomainDefinitions().getValueDomain(3);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The JsonBoolean from the terminal
     */
    public static JsonBoolean fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new JsonBooleanImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The JsonBoolean from the string representation
     */
    public static JsonBoolean fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new JsonBooleanImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The JsonBoolean read from the stream
     */
    public static JsonBoolean fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new JsonBooleanImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The JsonBoolean read from the stream
     */
    public static JsonBoolean fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new JsonBooleanImpl(res);
    }

    /**
     * Call this method to create a new JsonBoolean value. 
     * @param value  The value of the JsonBoolean to be created.
     * @return       The newly created JsonBoolean value
     */
    public static JsonBoolean create(Boolean value)
    {
        return new JsonBooleanImpl(JsonBooleanImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Boolean is a valid JsonBoolean
     * @param value  The Boolean value to be tested
     * @return       true if the provided Boolean is a valid JsonBoolean
     */
    public static boolean isValidJsonBoolean(Boolean value)
    {
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the Boolean value that is stored in this JsonBoolean
     * @return  The Boolean value stored in this JsonBoolean
     */
    public abstract Boolean value();
}
