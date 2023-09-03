import org.testng.annotations.*;

public class SnippetTestNG {

    // запускается каждый раз перед методом с аннотацией @Test
    @BeforeMethod
    void test1() {
        System.out.println("hi");
    }

    // Метод с этой аннотацией выполнится перед первым тестовым методом в текущем классе.
    @BeforeClass
    void test2() {
        System.out.println("hi");
    }

    // запускается один раз перед определенной группой тестов (тестые методы сначала нужно включить в группу)
    @BeforeGroups
    void test3() {
        System.out.println("hi");
    }

    // Выполняется перед запуском всех тестов в тестовом сьюте
    @BeforeSuite
    void test4() {
        System.out.println("hi");
    }


    // Выполняется перед запуском всех тестов в тестовом сьюте
    @BeforeTest
    void test5() {
        System.out.println("hi");
    }
}
