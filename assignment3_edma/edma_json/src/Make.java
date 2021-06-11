import org.abstractica.edma.generator.EdmaGenerator;

public class Make {
    public static void main(String[] args) {

        String projectDir = "/home/jorg/MyData/database/edma_projects/edma_json";
        EdmaGenerator generator = new EdmaGenerator("edma_json",projectDir + "/edmasrc", projectDir + "/src", "dk.oertel");
        generator.make();

    }
}
