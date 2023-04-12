class Animal{

    enum HighLevel{
        SHORT,
        MEDIUM,
        TALL
    }


    public void voice(){
        System.out.println("This the voice ...");

    }
}

class Dog extends Animal{

    HighLevel dogHL = HighLevel.SHORT;

    public void voice(){
        System.out.println("woof woof");
    }
}

class Cat extends Animal{
    int foot = 4;
    
    public void voice(){
        System.out.println("meoww");
    }
}

abstract class AbstractAnimal{
    abstract void callThem();
    
    void callToEat(){
        System.out.println("come come");
    }

    //salah satu perbedaan dengan interface,
    //kalau abstract dia harus ada default actionnya atau body nya, namun bisa untuk tidak di override dan akan menjadi method defaultnya
    void poo(){
        System.out.println("rrrr");
    };

}

class Wolf extends AbstractAnimal{
    void callThem(){
        System.out.println("AUUWW");
    }
}


interface InterfaceAnimal{
    //tidak bisa sebagai constructor, namun bisa default value dan di over ride
    int x = 5;


    void animalFootStep(); //(doesnt have body)

    //kalau bikin method harus di override di implement nya misalkan Horse, harus ada poo nya
    // void poo();
    
}

interface InterfaceMamals{
    void animalBorn();
}

class Horse implements InterfaceAnimal, InterfaceMamals{
    public void animalFootStep(){
        System.out.println("tak tik tuk");
    }

    public void animalBorn(){
        System.out.println("absolutely born");
    }

    // this.x = 7;
    int x = 7;
}