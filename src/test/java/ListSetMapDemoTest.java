//import org.junit.Before;
//import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class ListSetMapDemoTest {
private ListSetMapDemo crud;
private SoftwareDev dev;
private SoftwareTester tester;
    @Before
    public void setUp() throws Exception {
        crud = new ListSetMapDemo();
        dev = new SoftwareDev("Kevin", "Claassens", "KevinClaassens", 12000.00, 7500.00);
        tester = new SoftwareTester("Jibo", "Zimri", "JiboZimri", 10000, 5000);
    }

    @Test
    public void getDevListTest() {

        List expDevList = new ArrayList<>();
        expDevList = crud.getDevList();
        Assert.assertNotNull(expDevList);
    }


    @Test
    public void getDevSetTest() {

        Set expDevSet = new HashSet();
        expDevSet = crud.getDevSet();
        Assert.assertNotNull(expDevSet);


    }

    @Test
    public void getTesterListTest() {

        List expTesterList = new ArrayList();
        expTesterList = crud.getTesterList();
        Assert.assertNotNull(expTesterList);
    }

    @Test
    public void getTesterSet() {

        Set expTesterSet = new HashSet();
        expTesterSet = crud.getTesterSet();
        Assert.assertNotNull(expTesterSet);
    }

    @Test
    public void getMap() {

        Map expMap = new HashMap<>();
        expMap = crud.getMap();
        Assert.assertNotNull(expMap);
    }

    @Test
    public void addDevListTest() {

     int count1, count2;
     List list = new ArrayList();
     list = crud.getDevList();
     count1 = list.size();
     crud.addDevList(dev);
     count2 = list.size();

     Assert.assertTrue(count1<count2);

    }

    @Test
    public void addDevSetTest() {


        Set set = new HashSet();
        set = crud.getDevSet();
        int count1 = set.size();
        crud.addDevSet(dev);
        int count2 = set.size();

        Assert.assertTrue(count1<count2);

    }

    @Test
    public void addTesterListTest() {

        List list = crud.getTesterList();
        int count1 = list.size();
        crud.addTesterList(tester);
        int count2 = list.size();

        Assert.assertTrue(count2>count1);
    }

    @Test
    public void addTesterSetTest() {

        Set set = crud.getTesterSet();
        int count1 = set.size();
        crud.addTesterSet(tester);
        int count2 = set.size();

        Assert.assertTrue(count2>count1);
    }

    @Test
    public void addMapTest() {

        Map map = crud.getMap();
        int count1 = map.size();
        crud.addMap(dev, tester);
        int count2 = map.size();

        Assert.assertTrue(count2>count1);
    }

    @Test
    public void deleteDevListTest() {

        List list = crud.getDevList();
        crud.addDevList(dev);
        int count1 = list.size();
        crud.deleteDevList(dev);
        int count2 = list.size();

        Assert.assertTrue(count2<count1);
    }

    @Test
    public void deleteDevSetTest() {

        Set set = crud.getDevSet();
        crud.addDevSet(dev);
        int count1 = set.size();
        crud.deleteDevSet(dev);
        int count2 = set.size();

        Assert.assertTrue(count1>count2);
    }

    @Test
    public void deleteTesterList() {

        List list = crud.getTesterList();
        crud.addTesterList(tester);
        int count1 = list.size();
        crud.deleteTesterList(tester);
        int count2 = list.size();

        Assert.assertTrue(count1>count2);
    }

    @Test
    public void deleteTesterSet() {

        Set set = crud.getTesterSet();
        crud.addTesterSet(tester);
        int count1 = set.size();
        crud.deleteTesterSet(tester);
        int count2 = set.size();

        Assert.assertTrue(count1>count2);
    }

    @Test
    public void deleteMap() {

        Map map = crud.getMap();
        crud.addMap(dev, tester);
        int count1 = map.size();
        crud.deleteMap(dev, tester);
        int count2 = map.size();

        Assert.assertTrue(count1>count2);
    }
}