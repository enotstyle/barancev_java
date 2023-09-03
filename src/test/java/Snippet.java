import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {


    ChromeDriver wd = new ChromeDriver();

    void selectors_examples() {
        // поиск элемента внутри другого элемента
        wd.findElement(By.tagName("input1")).findElement(By.tagName("input2"));
    }        before.add(group);



    // взаимодействие с элементами
    void extract_values() {
        // получение зачение атрибута value
        String value = wd.findElement(By.name("xxx")).getAttribute("value");
    }


}
