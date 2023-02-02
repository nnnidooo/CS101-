 public class Driver {
    private String name;
    private int age;
}

    public Driver(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public void drive(Car toyota) {
        System.out.println(this.name + toyota.getModel());
    }
        public String getName(){
            return name;
    }
    public int getAge(){
            return age;
    }
 }
