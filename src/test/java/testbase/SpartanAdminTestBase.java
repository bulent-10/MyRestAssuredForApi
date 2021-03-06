package testbase;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utility.ConfigurationReader;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.reset;

public class SpartanAdminTestBase {
    public static RequestSpecification adminReqSpec ;

    @BeforeAll
    public static void setUp() {

        baseURI = ConfigurationReader.getProperty("spartan.base_url");
        basePath = "/api";
        adminReqSpec = given().log().all()
                .auth().
                basic(ConfigurationReader.getProperty("spartan.admin.username"),
                        ConfigurationReader.getProperty("spartan.admin.password")  ) ;

    }

    @AfterAll
    public static void cleanUp(){
        reset();
    }

}
