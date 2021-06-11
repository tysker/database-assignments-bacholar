package dk.oertel.generated.valuedomains;

import dk.oertel.generated.edma_json;
import dk.oertel.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.oertel.generated.valuedomains.impl.JsonNullImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: JsonNull
 */
public abstract class JsonNull implements Comparable<JsonNull>
{
    protected static final IMetaValueDomain edma_domain = edma_json.environment.getValueDomainDefinitions().getValueDomain(4);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The JsonNull from the terminal
     */
    public static JsonNull fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new JsonNullImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The JsonNull from the string representation
     */
    public static JsonNull fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new JsonNullImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The JsonNull read from the stream
     */
    public static JsonNull fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new JsonNullImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The JsonNull read from the stream
     */
    public static JsonNull fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new JsonNullImpl(res);
    }

    /**
     * Call this method to create a new JsonNull value. 
     * @param value  The value of the JsonNull to be created.
     * @return       The newly created JsonNull value
     */
    public static JsonNull create(Integer value) throws InvalidValueException
    {
        JsonNullImpl.edma_validate(value);
        return new JsonNullImpl(JsonNullImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Integer is a valid JsonNull
     * @param value  The Integer value to be tested
     * @return       true if the provided Integer is a valid JsonNull
     */
    public static boolean isValidJsonNull(Integer value)
    {
        try
        {
            JsonNullImpl.edma_validate(value);
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
     * returns the Integer value that is stored in this JsonNull
     * @return  The Integer value stored in this JsonNull
     */
    public abstract Integer value();
}
