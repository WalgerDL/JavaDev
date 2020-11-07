package sber.homeWork.extendS;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
class Animal {

    private String breed="";
    private String paws=" двигается ";
    private String mouth= "и питается ";
    Animal(String p, String m, String b){
        breed=b;
        paws=p;
        mouth=m;
    }

    public Animal() {

    }
    String  sounds(){
        System.out.print("Издаёт звуки ");
        return "";
    }


}
class DemoAnimals{
    public static void main(String[] args) {


    Dog dog=new Dog();
    dog.demoDog();
        System.out.println(dog.sounds()+ dog.voice+"\n");
    Cat cat=new Cat();
    cat.demoCat();
        System.out.println(cat.sounds()+cat.voice);

    }
}
