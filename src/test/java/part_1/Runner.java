package part_1;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        FirstSeleniumTest test = new FirstSeleniumTest();
        test.setUp();
        test.testLogging();
        test.tearDown();
    }
}
