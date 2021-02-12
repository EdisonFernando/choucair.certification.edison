package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target UNIVER=Target.the("select the choucair university").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target COURSE=Target.the("search the course").located(By.id("coursesearchbox"));
    public static final Target GO=Target.the("search go").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SCOURSE=Target.the("select the course").located(By.xpath("//h4[contains(text(),'Prueba Técnica - Analista Bancolombia')]"));
    public static final Target NAME_COURSE=Target.the("Curse name").located(By.xpath("//h1[contains(text(),'Prueba Técnica - Analista Bancolombia')]"));
}
