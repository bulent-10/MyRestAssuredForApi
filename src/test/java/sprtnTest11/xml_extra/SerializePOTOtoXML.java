package sprtnTest11.xml_extra;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SerializePOTOtoXML {

    // this request will always return correct response
    // whatever you sent , so it's a good place to try out
    // the body got transformed from pojo to xml
    // by checking the request log body section
    @Test
    public void serializingPOJOtoXML(){

        given()
                .log().body()
                .contentType(ContentType.XML)
                .body(new Item(12,"Adam","Male",1231231231) ).
                when()
                .post("https://postman-echo.com/post") ;

    }

    @Test
    public void serializingPOJOtoXML2(){

        given()
                .log().body()
                .contentType(ContentType.XML)
                .body(new SpartanXml(12,"Adam","Male",1231231231) ).
                when()
                .post("https://postman-echo.com/post");

    }

}
