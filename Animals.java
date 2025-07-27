package SS8.bai1;

public abstract class Animals {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animals(String name, int age) {
        if (name==null||name.isEmpty()){
            throw new IllegalArgumentException("Ten khong hop le");
        }
        if (age<0){
            throw new IllegalArgumentException("Tuoi khong hop le");
        }
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Ten la :"+name+",tuoi la :"+age);
    }
    public void makeSound(){
        System.out.println("Some generic sound");
    }
}
