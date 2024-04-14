public class Main {
    public static void main(String[] args){
        Data d = new Data();

        //d.name = "Programmer";

        //java: name has private access in Data

        d.setName("Programmer");
        System.out.println(d.getName());
        //Programmer
    }
}

class Data {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
