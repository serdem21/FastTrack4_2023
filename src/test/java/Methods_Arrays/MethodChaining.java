package Methods_Arrays;

public class MethodChaining {

    public static void main(String[] args) {

        String s = "   Hello World     ";

        System.out.println(s.trim().charAt(0));
        System.out.println(s.trim().toLowerCase().substring(0,2));
        System.out.println(s.trim());
        System.out.println(s.trim().substring(0, s.trim().indexOf(" ")));
        System.out.println(s.trim().toLowerCase());
        System.out.println(s.trim().equals("hello"));


        /*
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWit(10, TimeUnit.SECOND);
        */


        /*
        new Select(driver.findElement(By.id("dropdown"))).getFirstSelectedOption().getText();
         */

        /*

                given().log().body()
                .contentType(ContentType.JSON)
                .pathParam("id",id)
                .body(requestBody)
                .when().put("/api/spartants/{id}")
                .then().statusCode(204);
        */
    }
}
