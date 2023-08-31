package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionsTests extends TestBase {

    @Test
    public void testGroupDeletions() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getContactHelper().getGroupCount();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup(before - 1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getContactHelper().getGroupCount();
        Assert.assertEquals(after, before - 1);
    }

}
