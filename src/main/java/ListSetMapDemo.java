import java.util.*;


public class ListSetMapDemo {

    List<SoftwareDev> devList = new ArrayList<>();
    Set<SoftwareDev> devSet = new HashSet<>();

    List<SoftwareTester> testerList = new ArrayList<>();
    Set<SoftwareTester> testerSet = new HashSet<>();

    Map map = new HashMap<SoftwareDev, SoftwareTester>();

    private SoftwareDev dev;
    private SoftwareTester tester;

    public ListSetMapDemo(){

        dev = new SoftwareDev("Clayton", "Claassens", "ClaytonClaassens", 20000, 16000);
        tester = new SoftwareTester("Jacob", "Zimri", "JacobZimri", 200000, 160000);

        devList.add(dev);
        testerList.add(tester);

        devSet.add(dev);
        testerSet.add(tester);

        map.put(dev, tester);

    }

    public List getDevList() { return devList;}

    public Set<SoftwareDev> getDevSet() {
        return devSet;
    }

    public List<SoftwareTester> getTesterList() {
        return testerList;
    }

    public Set<SoftwareTester> getTesterSet() {
        return testerSet;
    }

    public Map<SoftwareDev, SoftwareTester> getMap() {
        return map;
    }


    public void addDevList(SoftwareDev dev){

        devList.add(dev);
    }

    public void addDevSet(SoftwareDev dev){

        devSet.add(dev);
    }

    public void addTesterList(SoftwareTester tester){

        testerList.add(tester);
    }

    public void addTesterSet(SoftwareTester tester){

        testerSet.add(tester);
    }

    public void addMap(SoftwareDev dev, SoftwareTester tester){

        map.put(dev, tester);
    }

    public void deleteDevList(SoftwareDev dev){

        devList.remove(dev);
    }

    public void deleteDevSet(SoftwareDev dev){

        devSet.remove(dev);
    }

    public void deleteTesterList(SoftwareTester tester){

        testerList.remove(tester);
    }

    public void deleteTesterSet(SoftwareTester tester){

        testerSet.remove(tester);
    }

    public void deleteMap(SoftwareDev dev, SoftwareTester tester){

        map.remove(dev, tester);
    }



    public static void main(String[] args) {

        ListSetMapDemo crud = new ListSetMapDemo();

        System.out.println("Developer List: " + crud.getDevList());
        System.out.println("Tester List: " + crud.getTesterList());
        System.out.println("Developer Set: " + crud.getDevSet());
        System.out.println("Tester Set: " + crud.getTesterSet());
        System.out.println("Map: " + crud.getMap());

    }




}
