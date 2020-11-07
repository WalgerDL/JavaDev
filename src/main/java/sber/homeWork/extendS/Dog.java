package sber.homeWork.extendS;

class Dog extends Animal {

    private String name="Собака ";
    private String swim="Умение плавать, является преимуществом собаки.";
    String voice="гав-гав!";

    public Dog() {
        super();
        setBreed("породы овчарка, ");
    }

    String move(){
        System.out.print("очень быстро" + super.getPaws());
        return "";
    }
    String diet(){
        System.out.print(super.getMouth() + "зайцами.");
        return "";
    }
    void demoDog(){
        System.out.print(name+getBreed());
            System.out.println(move()+diet()+swim);

        }
    }




