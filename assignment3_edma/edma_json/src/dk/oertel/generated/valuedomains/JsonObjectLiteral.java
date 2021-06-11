package dk.oertel.generated.valuedomains;

import dk.oertel.generated.edma_json;
import dk.oertel.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.oertel.generated.valuedomains.impl.JsonObjectLiteralBuilderImpl;
import dk.oertel.generated.valuedomains.impl.JsonObjectLiteralImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: JsonObjectLiteral
 */
public abstract class JsonObjectLiteral implements Comparable<JsonObjectLiteral>, Iterable<Member>
{
    protected static final IMetaValueDomain edma_domain = edma_json.environment.getValueDomainDefinitions().getValueDomain(6);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The JsonObjectLiteral from the terminal
     */
    public static JsonObjectLiteral fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new JsonObjectLiteralImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The JsonObjectLiteral from the string representation
     */
    public static JsonObjectLiteral fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new JsonObjectLiteralImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The JsonObjectLiteral read from the stream
     */
    public static JsonObjectLiteral fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new JsonObjectLiteralImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The JsonObjectLiteral read from the stream
     */
    public static JsonObjectLiteral fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new JsonObjectLiteralImpl(res);
    }

    /**
     * Starts creation of a new JsonObjectLiteral
     * @return  Builder interface to build the list
     */
    public static JsonObjectLiteralBuilder begin()
    {
        return new JsonObjectLiteralBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * Returns the size of this list
     * @return  the size of this list
     */
    public abstract int size();

    /**
     * Returns the element on a given index in this list
     * @param index  The index of the element to be returned
     * @return       the element on the given index in this list
     */
    public abstract Member get(int index);


    /**
     * Interface to create a list
     */
    public interface JsonObjectLiteralBuilder
    {

        /**
         * Adds an element to the list
         * @param member  The element to be added to the list
         * @return        An interface to the builder for chaining method calls
         */
        public JsonObjectLiteralBuilder add(Member member);

        /**
         * Builds the list with the added elements
         * @return  The builded list
         */
        public JsonObjectLiteral end();

    }

}
