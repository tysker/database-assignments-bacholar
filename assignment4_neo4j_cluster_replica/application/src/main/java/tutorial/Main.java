package tutorial;

public class Main {
    public static void main( String... args ) throws Exception
    {
        try ( HelloWorldExample greeter = new HelloWorldExample( "bolt://localhost:7688", "neo4j", "1234" ) )
        {
            //greeter.printGreeting( "hello, world" );
            greeter.getGreeting(0);
        }
    }
}
