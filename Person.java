public class Person {
    private String name; // private = restricted access

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName; // this is used to refer the current object
    }
}
