package sber.homeWork.extendS;

public class Cat extends Animal {
    private String name="Кот ";
    private String climbUpTrees="Умение лазать по деревьям, является преимуществом кота.";
    String voice="мяу!";

    public Cat(){
        super();
        setBreed("породы сибирский, ");
    }
    String move(){
        System.out.print("очень тихо" + super.getPaws());
        return "";
    }
    String diet(){
        System.out.print(super.getMouth() + "мышами.");
        return "";
    }
    void demoCat(){
        System.out.print(name+getBreed());
        System.out.println(move()+diet()+climbUpTrees);

    }
}
