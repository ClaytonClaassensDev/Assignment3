public class Person {

    String name, surname;

    public Person(){


    }

    public Person(String name, String surname){

        this.name = name;
        this.surname = surname;

    }

    public void setName(String nm){

        this.name = nm;
    }

    public void setSurname(String snm){

        this.surname = snm;
    }

    public String getName(){return name;}

    public String getSurname(){return surname;}


}
