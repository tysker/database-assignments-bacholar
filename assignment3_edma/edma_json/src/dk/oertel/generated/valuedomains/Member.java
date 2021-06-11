package dk.oertel.generated.valuedomains;

import dk.oertel.generated.edma_json;
import dk.oertel.generated.valuedomains.JsonObject;
import dk.oertel.generated.valuedomains.Name;
import dk.oertel.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.oertel.generated.valuedomains.impl.MemberBuilderImpl;
import dk.oertel.generated.valuedomains.impl.MemberImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Member
 */
public abstract class Member implements Comparable<Member>
{
    protected static final IMetaValueDomain edma_domain = edma_json.environment.getValueDomainDefinitions().getValueDomain(7);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Member from the terminal
     */
    public static Member fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new MemberImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Member from the string representation
     */
    public static Member fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new MemberImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Member read from the stream
     */
    public static Member fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new MemberImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Member read from the stream
     */
    public static Member fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new MemberImpl(res);
    }

    /**
     * Starts creation of a new Member
     * @return  Builder interface to set the name field
     */
    public static MemberBuilderName create()
    {
        return new MemberBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field name
     * @return  The value of the field name
     */
    public abstract Name name();

    /**
     * returns the value of the field value
     * @return  The value of the field value
     */
    public abstract JsonObject value();


    /**
     * Builder interface for setting the name field of Member
     */
    public interface MemberBuilderName
    {

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the value field
         */
        public MemberBuilderValue name(Name name);

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the value field
         */
        public MemberBuilderValue name(String name) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the value field of Member
     */
    public interface MemberBuilderValue
    {

        /**
         * sets the value field.
         * @param value  The value to assign to the value field
         * @return       The created Member value
         */
        public Member value(JsonObject value);

    }

}
