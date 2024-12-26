public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();     <-------- mai dai
        Cow wagyu = new Cow();
        Duck donal = new Duck("โดนัล");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();
        Owl hedwig = new Owl();
        PakingDuck JiaTongHeng = new PakingDuck("JTH");
        wagyu.sound();
        donal.sound();
        burin.sound();
        hedwig.sound();
        JiaTongHeng.sound();
        donal.fly();
        donal.glide();
        donal.clean(wagyu);
        daisy.clean(donal);
        JiaTongHeng.clean(daisy);
        JiaTongHeng.beCrispy();
        donal.clean(new Cow());
    }
}