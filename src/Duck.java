public class Duck extends Animal implements Flyable{
    void sound(){
        System.out.println("quack quack (ก๊าบ ก๊าบ)");
    }
    void walking_in_line(){
        System.out.println("....try to walk in line");
    }
    public void fly(){
        System.out.println("quack fly!");
    }
    public void glide(){
        System.out.println("quack glide!");
    }

    void clean(Animal animal){
        System.out.println(this.toString() + " is clean "+ animal);
    }
    String name;
    public Duck(String name){
        this.name = name;
    }
    public String toString(){
        return "เป็ด : " + this.name ;
    }
}
