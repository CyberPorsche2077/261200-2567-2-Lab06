public class PakingDuck extends Duck{
    PakingDuck(String name){
        super(name);
    }
    void clean(Animal animal){
        System.out.println("ผีหลอกวิญญาณหลอน.......");
    }

    public void beCrispy(){
        System.out.println("Grob grob! (sound effect)");
    }
}
