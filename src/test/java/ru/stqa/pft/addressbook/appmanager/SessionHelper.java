package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// помогает выполнять вход
public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String userName, String pass) {
        type(By.name("user"), userName);
        type(By.name("pass"), pass);
        click(By.cssSelector("[type=\"submit\"]"));
    }
}