import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SnippetTestNG {

    ///////////////////////////////
    ///////////Фикстуры////////////
    ///////////////////////////////

    // запускается каждый раз перед методом с аннотацией @Test
    @BeforeMethod(enabled = false)
    void test1() {
        System.out.println("hi");
    }

    // Метод с этой аннотацией выполнится перед первым тестовым методом в текущем классе.
    @BeforeClass(enabled = false)
    void test2() {
        System.out.println("hi");
    }

    // запускается один раз перед определенной группой тестов (тестые методы сначала нужно включить в группу)
    @BeforeGroups(enabled = false)
    void test3() {
        System.out.println("hi");
    }

    // Выполняется перед запуском всех тестов в тестовом сьюте
    @BeforeSuite(enabled = false)
    void test4() {
        System.out.println("hi");
    }


    // Выполняется перед запуском всех тестов в тестовом сьюте
    @BeforeTest(enabled = false)
    void test5() {
        System.out.println("hi");
    }




    ///////////////////////////////
    ////////Параметризация/////////
    ///////////////////////////////

    // также можно возвращать Object[][] и передавать парметры в двумерном массиве
    @DataProvider
    Iterator<Object[]> testData() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{1, "first"});
        list.add(new Object[]{2, "sec"});
        list.add(new Object[]{3, "th"});
        list.add(new Object[]{4, "fo"});
        return list.iterator();
    }

    @Test(dataProvider = "testData")
    void test(int i, String s) {
        System.out.println(i + "  " + s);
    }
}
