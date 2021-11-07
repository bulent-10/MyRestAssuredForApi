package sprtnTest11.xml_extra;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import org.junit.jupiter.api.Test;
import testbase.SpartanAdminTestBase;

import static io.restassured.RestAssured.with;

public class DeserializeXMLtoPOJO extends SpartanAdminTestBase {

    @Test
    public void getAllSpartanAsXMLSaveFirstToPojo(){

        XmlPath xp =
                with()
                        .spec(adminReqSpec)
                        .accept(ContentType.XML).
                        get("/spartans")
                        //.prettyPeek()
                        .xmlPath();

        Item pojo1 = xp.getObject("List.item[0]", Item.class) ;
        System.out.println("pojo1 = " + pojo1);

        SpartanXml pojo2 = xp.getObject("List.item[0]", SpartanXml.class);
        System.out.println("pojo2 = " + pojo2);

    }

}
