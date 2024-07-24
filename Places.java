//1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.

class HillStations{
    public void location(){
        System.out.println("HillStation don't know which one tee hee");
    }
    public void famousFor(){
        System.out.println("Want to know");
    }
}
class Manali extends HillStations{
    public void location(){
        System.out.println("Manali");
    }
    public void famousFor(){
        System.out.println("Manali famous for its Snow-capped mountains");
        System.out.println("===--------------------------------------------------===");
    }
}
class Mussoorie extends HillStations{
    public void location(){
        System.out.println("Mussoorie");
    }
    public void famousFor(){
        System.out.println("Mussoorie famous for its scenic beauty and pleasant climate");
        System.out.println("===--------------------------------------------------===");
    }
}
class Gulmarg extends HillStations{
    public void location(){
        System.out.println("Gulmarg");
    }
    public void famousFor(){
        System.out.println("Gulmarg famous for its Natural beauty and adventure sports");
        System.out.println("===--------------------------------------------------===");
    }
}
public class Places{
    public static void main(String[] args) {
        HillStations hs = new Manali();
        HillStations hs1 = new Mussoorie();
        HillStations hs2 = new Gulmarg();
        hs.location();
        hs.famousFor();
        hs1.location();
        hs1.famousFor();
        hs2.location();
        hs2.famousFor();
    }
}