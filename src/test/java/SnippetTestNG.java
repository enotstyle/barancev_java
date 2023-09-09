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
        System.out.println("BeforeMethod");
    }

    // Метод с этой аннотацией выполнится перед первым тестовым методом в текущем классе.
    @BeforeClass(enabled = false)
    void test2() {
        System.out.println("BeforeClass");
    }

    // запускается один раз перед определенной группой тестов (тестые методы сначала нужно включить в группу)
    @BeforeGroups(value = "group1", enabled = false)
    void test3() {
        System.out.println("BeforeGroups");
    }

    // Выполняется перед запуском всех тестов в тестовом сьюте
    @BeforeSuite(enabled = false)
    void test4() {
        System.out.println("BeforeSuite");
    }

    // Выполняется перед запуском всех тестов которые внутри тэга <test> в сьюте
    @BeforeTest(enabled = false)
    void test5() {
        System.out.println("BeforeTest");
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
