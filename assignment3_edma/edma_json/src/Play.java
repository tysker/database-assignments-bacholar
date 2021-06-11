import dk.oertel.generated.valuedomains.*;

public class Play {

    public static void main(String[] args) {

        Member jsonString1 = Member.create().name("String1").value(JsonObject.create(JsonString.create("1")));
        Member jsonString2 = Member.create().name("String2").value(JsonObject.create(JsonString.create("2")));
        Member jsonString3 = Member.create().name("String3").value(JsonObject.create(JsonString.create("3")));
        Member jsonNumber1 = Member.create().name("Number1").value(JsonObject.create(JsonNumber.create(1.0)));
        Member jsonNumber2 = Member.create().name("Number2").value(JsonObject.create(JsonNumber.create(2.0)));
        Member jsonNumber3 = Member.create().name("Number3").value(JsonObject.create(JsonNumber.create(3.0)));
        Member jsonBooleanTrue = Member.create().name("BooleanTrue").value(JsonObject.create(JsonBoolean.create(true)));
        Member jsonBooleanFalse = Member.create().name("BooleanFalse").value(JsonObject.create(JsonBoolean.create(false)));
        Member jsonNull = Member.create().name("Null").value(JsonObject.create(JsonNull.create(0)));

        JsonObjectLiteral singleJsonObject1 = JsonObjectLiteral.begin()
                .add(jsonString1)
                .add(jsonNumber1)
                .end();
        JsonObjectLiteral jsonObjectLiteral2 = JsonObjectLiteral.begin()
                .add(jsonString2)
                .add(jsonNumber3)
                .add(jsonBooleanTrue)
                .end();

        JsonObject jsonObject1 = JsonObject.create(singleJsonObject1);
        JsonObject jsonObject2 = JsonObject.create(jsonObjectLiteral2);

        Member json = Member.create()
                .name("MultiJson")
                .value(JsonObject.create(Array.begin()
                        .add(jsonObject1)
                        .add(jsonObject2)
                        .end()));

        System.out.println(json);


    }

}
