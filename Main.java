// to compile in console javac Main.java
// to run in console java Main

import java.util.Scanner;
import mypackage.Package;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.function.Consumer;

enum Gender{
  MALE,
  FEMALE
}

interface StringFunction{
  String run(String str);
}


public class Main {
  
  // Final
  final int xFinal = 5;

  /*
  // Constructor
  String yConst;
  public Main(String xConst){
    yConst=xConst;
  }
  */

  //Method or function

    static void myFunction(){
      System.out.println("I am executed");
    }

    //java bisa memeliki fungsi yang sama asalkan tipe dan atau banyak parameternya berbeda

    static void myFunction(String name){
      System.out.println("yg ini nama saya " + name);
    }

    static void myFunction(String fname,String lname){
      System.out.println("lengkapnya " + fname + lname);
    }

    static int funcWithReturn(int x, int y){

      return x + y;

    }

    static void funcWithBlockScope(String name){
      {
        String greet = "hello";
        System.out.println(greet + name);
      }
      //Tidak bisa untuk menggunakan variable diluar block
      //System.out.println(greet);
    }

    public void funcPub(){
      System.out.println("coba yg public func");
    }

    static void checkAge(int age){
    if(age < 18){
      throw new ArithmeticException("Access Denied - your age must be older than 18");
    }else{
      System.out.println("your access Granted");
    }
  }

    public static void printFormatted(String str, StringFunction format){
      String result = format.run(str);
      System.out.println(result);
    }


  public static void main(String[] args) {
    // System.out.println("Hello World");
    // System.out.println("java is a must");
    // System.out.print("ini Print aja ");
    // System.out.print("dan Print aja lagi");
    // // this is a single comment as Javascript
    // System.out.println("ini hasil perkalian");
    // System.out.println(5 * 5);
    /* and also the multiple comment line,
    isn't it */

    /*
    //variable type
    String wording = "ini adalah umur saya";
    int umur = 20;
    umur = 15;
    System.out.println(wording);
    System.out.println(umur);

    final int umurBayangan = 50;

    float myFloatNum = 5.99f;
    double myDoubleNum = 5.99;
    System.out.println("ini float aja");
    System.out.println(myFloatNum);

    int a=2, b=3, c=5;
    System.out.println("hasil combo");
    System.out.println(a+b+c);
    */

    /*
    int num = 4, num2 = 8;
    System.out.println(num + num2);
    System.out.println("Hello" + "World");
    int same1, same2, same3;
    same1 = same2 = same3 = 50;
    System.out.println(same1 + same2 + same3);

    float varDec = 22e-4f;
    System.out.println(varDec);
    double varRibu = 22.44e4;
    System.out.println(varRibu);

    boolean isTrue = true;
    System.out.println(isTrue);
    
    System.out.println("char");
    char ascii = 44, charOnly = 'D';
    System.out.println(ascii);
    System.out.println(charOnly);
    */

    /*
    //Casting
    //widening casting
    int number = 4;
    double thisIsDouble = number;

    System.out.println(number);
    System.out.println(thisIsDouble);

    //narrowing casting
    double doubleNumber = 4.43;
    int iniInt = (int) doubleNumber;

    System.out.println(doubleNumber);
    System.out.println(iniInt);

    System.out.println("&=");
    int dan = 3;
    dan &= 3;
    System.out.println(dan);
    System.out.println(9 | 7);
    
    //0000 1001 (9)
  | //0000 0111 (7)
    //----------
    //0000 1111 (15)
    
    System.out.println(9 & 7);

    int ini = 8;
    int itu = ini << 3;
    // << 3 it's mean 8 will multiply by 2^3;
    // this similar with >> but vice versa. 7 will divide by 2^3;

    System.out.println(itu);

    */

    /*
    //Strings

    String iniStr = "aku ibu budi";
    int panjangStr = iniStr.length();
    System.out.println(panjangStr);
    System.out.println(iniStr.indexOf("ibu"));
    */

    /*
    //For Each

    String[] name = {"yora", "nata"};

    for (String i : name) {
      System.out.println(i);
    }
    
    for(int i=0; i<5; i++){
      
      if(i == 2){
        continue;
      }else if(i == 4){
        break;
      }
      System.out.println(i);
    }

    String[] cars = {"Volvo", "Merc", "Ferrari"};
    cars[0] = "Jeruk";
    System.out.println(cars[0]);
    System.out.println(cars.length);
    */

    /*
    //Function
    myFunction();
    myFunction("Udin");
    myFunction("add","yyy");
    System.out.println( funcWithReturn(4,3));
    funcWithBlockScope("Aro");
    */

    /*
    //class object
    Car myObj = new Car();
    System.out.println(myObj);
    System.out.println(myObj.wheel);
    */

    /*
    //public func

    Main myObjPub = new Main();
    myObjPub.funcPub();

    Car myObjPubCar = new Car();
    myObjPubCar.pubFuncCar();
    */

    /*
    //Constructor
    Main CObj = new Main("ini const ku");
    System.out.println("yObj");
    System.out.println(CObj.yConst);
    */

    /*
    //Final
    Main myFinalObj = new Main();
    System.out.println("xFinal");
    // myFinalObj.xFinal = 7;
    System.out.println(myFinalObj.xFinal);
    */

    /*
    //Abstract
    Student studentObj = new Student();

    System.out.println("Name: " + studentObj.fname);
    System.out.println("Age: " + studentObj.age);
    System.out.println("Graduation Year: " + studentObj.graduationYear);
    studentObj.study(); // call abstract method
    */


    /*
    //Private get and set on class

    Person myPersonObj = new Person();
    myPersonObj.setName("Udin");
    String objPersonName = myPersonObj.getName();
    System.out.println(objPersonName);
    myPersonObj.setAge(23);
    int objPersonAge = myPersonObj.getAge();
    System.out.println(objPersonAge);
    */

    /*
    //Package

    Username myUserObj = new Username();
    myUserObj.SayName();

    // Scanner myObj = new Scanner(System.in);
    // System.out.println("Enter username");

    // String userName = myObj.nextLine();
    // System.out.println("Username is: " + userName);

    Package myPackClass = new Package();
    myPackClass.packageGreeting();
    */

    /*
    //Inheritance
    //Inheritance nya aku taruh di Car.java
    Car myObjCar = new Car();
    myObjCar.pubFuncCar();
    */

    /*
    //Polymorphism
    //berada di Animal

    Animal myAnimalObj = new Animal();
    myAnimalObj.voice();    
    Animal myDogObj = new Dog();
    myDogObj.voice();

    //karena obj Cat myCatObj ini diambil dari obj Cat dengan type Animal sehingga tidak ada foot disana
    // tapi apabila diambil dari type Cat juga, maka foot akan muncul..
    // Animal myCatObj = new Cat();
    Cat myCatObj = new Cat();
    System.out.println(myCatObj.foot);
    */

    /*
    //Inner Class
    OuterClass myOuterObj = new OuterClass();
    System.out.println(myOuterObj.x);
    OuterClass.InnerClass myInnerObj = myOuterObj.new InnerClass();
    System.out.println(myInnerObj.y);
    System.out.println("sum : " + (myOuterObj.x + myInnerObj.y));

    //Inner class juga bisa diprivate ataupun di protect

    //selain itu inner class juga bisa menggugakan static agar tidak perlu melakukan pembuatan object baru
    Outer2Class.Inner2Class myInner2Obj = new Outer2Class.Inner2Class(); //disini tidak perlu akses dari object yang dimulai dari outer
    System.out.println(myInner2Obj.y2);

    //dari inner juga bisa mengakses nilai dari outer
    System.out.println("ini nilai dari outernya : " + myInnerObj.nilaiOuter());

    */

    /*
    //Abstract Class

    Wolf myAnimalObj = new Wolf();
    myAnimalObj.callThem();
    myAnimalObj.poo();
    */


    /*
    //Interface class

    Horse myIntObj = new Horse();
    myIntObj.animalFootStep();
    System.out.println(myIntObj.x);

    //karena InterfaceAnimal adalah Interface sehingga dia juga berupa abstract sehingga tidak bisa di instantiated
    // InterfaceAnimal myIntAn = new InterfaceAnimal();

    //Interface juga dapat implement lebih dari satu
    myIntObj.animalBorn();

    */


    /*
    //Enum

    Gender male = Gender.MALE;
    System.out.println(male);

    Dog myObjDog = new Dog();
    System.out.println(myObjDog.dogHL);

    switch(myObjDog.dogHL){
      case SHORT:
        System.out.println("the Dog is Short");
        break;
      case MEDIUM:
        System.out.println("the Dog is Medium");
        break;
      case TALL:
        System.out.println("the Dog is Tall");
        break;
      default:
        System.out.println("not one correct");
    }
    
    //loop the enum

    for(Animal.HighLevel hlVar : Animal.HighLevel.values()) {
      System.out.println(hlVar);
    }
    */

    /*
    //User Input
      //menggunakan java.util.Scanner
      //beberapa input yang ada sebagai berikut
        //nextLine : String
        //nextBoolean : boolean
        //nextByte : byte
        //nextDouble : double
        //nextFloat : float
        //nextInt : int
        //nextLong : long
        //nextShort : short


    Scanner myInputObj = new Scanner(System.in);
    System.out.println("Silakan masukan username anda :");

    String username = myInputObj.nextLine();
    System.out.println("Username anda : " + username);

    Scanner maleQ = new Scanner(System.in);

    System.out.println("apakah anda laki2 : ");
    boolean mAns = maleQ.nextBoolean();
    System.out.println("ans :" + (mAns ? "Ya" : "Tidak"));

    Scanner ageObj = new Scanner(System.in);

    System.out.println("umur?");
    int ageAns = ageObj.nextInt();
    System.out.println(ageAns);

    */


   /*
   //Date and Time
    LocalDate myDateObj = LocalDate.now();
    System.out.println("Tanggal Sekarang");
    System.out.println(myDateObj);

    LocalTime myTimeObj = LocalTime.now();
    System.out.println("Waktu Sekarang");
    System.out.println(myTimeObj);

    LocalDateTime myDateTimeObj = LocalDateTime.now();
    System.out.println("Tanggal dan Waktu Sekarang");
    System.out.println(myDateTimeObj);

    DateTimeFormatter myDateTimeFormatterObj = DateTimeFormatter.ofPattern("EEEE, dd-MMMM-yyyy HH:mm:ss");
    String formattedDate = myDateTimeObj.format(myDateTimeFormatterObj);
    System.out.println("Tanggal formatted");
    System.out.println(formattedDate);
    */

    /*
    //Array List
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("ZBMW");
    cars.add("Volvo");

    String tempCar = cars.get(0);

    System.out.println("initiate");
    System.out.println(cars);
    
    cars.set(1, "Toyota");

    cars.add("Hyundai");

    System.out.println("after set and add");
    System.out.println(cars);
    System.out.println(tempCar);
    System.out.println("cars Size");
    System.out.println(cars.size());
  
    System.out.println("after remove");
    cars.remove(1);

    System.out.println(cars);

    for(int i=0; i<cars.size();i++){
      System.out.println("mobil " + i + " : " + cars.get(i));
    }

    Collections.sort(cars);

    System.out.println("setelah Sort");

    for(int i=0; i<cars.size();i++){
      System.out.println("mobil " + i + " : " + cars.get(i));
    }

    System.out.println("after clear");
    cars.clear();
    System.out.println(cars);


    ArrayList<Boolean> code = new ArrayList<Boolean>();

    code.add(true);
    code.add(false);

    for(Boolean i : code){
      System.out.println("this " +i);
    }

    ArrayList<Integer> theNum = new ArrayList<Integer>();

    theNum.add(23);
    theNum.add(90);
    theNum.add(20);

    for(int i : theNum){
      System.out.println(i);
    }

    Collections.sort(theNum);

    System.out.println("setelah sort");

    for(int i : theNum){
      System.out.println(i);
    }
    
    

   LinkedList<String> Animal = new LinkedList<String>();

   Animal.add("Wolf");
   Animal.add("Bird");

   System.out.println(Animal);

   Animal.addFirst("Tiger");
   Animal.addLast("Cat");

   System.out.println(Animal);

   for(String i : Animal){
    System.out.println("This Animal List : " + i);
   }

   Collections.sort(Animal);

   for(String i : Animal){
    System.out.println("Animal after sort : " + i);
   }

   System.out.println("this the size of Animal " + Animal.size());

   System.out.println("this the 1st item : " + Animal.getFirst());

   System.out.println("this the 2nd item : " + Animal.get(1));

   System.out.println("this the last item : " + Animal.getLast());


   Animal.remove(2);

   System.out.println(Animal);

   Animal.removeFirst();
   System.out.println(Animal);

   Animal.removeLast();
   System.out.println(Animal);

  */

 /*

  HashMap<String, String> capitalCities = new HashMap<String, String>();

  //The First arg is key, and the second is value

  capitalCities.put("Indonesia","Jakarta");
  capitalCities.put("England", "London");
  capitalCities.put("Japan", "Tokyo");
  System.out.println(capitalCities);

  capitalCities.get("Indonesia");
  System.out.println(capitalCities.get("Indonesia"));

  String capitalOfEngland = capitalCities.get("England");
  System.out.println("England capital city is " + capitalOfEngland);

  int sizeOfCapitalCities = capitalCities.size();
  System.out.println("size of capitalcities is " + sizeOfCapitalCities);

  for(String i : capitalCities.keySet()){
    System.out.println("this the key set " + i + " and this is the value " + capitalCities.get(i));
  }

  for(String i : capitalCities.values()){
    System.out.println("this the values " + i);
  }



  capitalCities.remove("Japan");
  System.out.println(capitalCities);
  sizeOfCapitalCities = capitalCities.size();
  System.out.println("size of capitalcities is " + sizeOfCapitalCities);

  capitalCities.clear();
  System.out.println(capitalCities);



  //the type when create hashmap must be a object (String, Integer, Boolean) not a primitive type like int

  HashMap<String, Integer> ageObject = new HashMap<String, Integer>();

  ageObject.put("Andi", 20);
  ageObject.put("Rere", 22);
  ageObject.put("Morgan", 30);


  for(String i : ageObject.keySet()){
    System.out.println("name : " + i + " his/her age is " + ageObject.get(i));
  }


  */

  /*
  //Hashset

  HashSet<String> myNeighbour = new HashSet<String>();

  myNeighbour.add("udin");
  myNeighbour.add("arif");
  myNeighbour.add("malik");
  myNeighbour.add("siti");

  System.out.println(myNeighbour);

  System.out.println(myNeighbour.contains("siti"));
  System.out.println(myNeighbour.contains("siti a"));

  myNeighbour.remove("malik");
  System.out.println(myNeighbour.size());
  System.out.println(myNeighbour);

  for(String i : myNeighbour){
    System.out.println("my Neighbour " + i);
  }

  myNeighbour.clear();
  System.out.println(myNeighbour);


  HashSet<Integer> myNum = new HashSet<Integer>();

  myNum.add(2);
  myNum.add(4);
  myNum.add(7);

  for(int i=0; i<10; i++){
    if(myNum.contains(i)){
      System.out.println(i + " terdapat pada list");
    }else{
      System.out.println(i + " TIDAK terdapat pada list");

    }
  }
  */


  /*
  //Iterator

  ArrayList<String> cart = new ArrayList<String>();

  cart.add("sayur sawi");
  cart.add("buah apel");
  cart.add("buah mangga");
  cart.add("buah pisang");
  cart.add("buah lemon");

  System.out.println(cart);

  Iterator<String> iter = cart.iterator();

  System.out.println(iter);
  System.out.println(iter.next());
  // System.out.println(iter.next());

  System.out.println("menuju loop");
  
  while(iter.hasNext()){

    String namaBuah = iter.next();
    System.out.println(namaBuah);

    if(namaBuah.length() <= 9){
      iter.remove();
    }

  }

  System.out.println(cart);



  
    */

   /*

   //Java Wrapper Class

   int primInt = 4;
   Integer classInt = 5;

   System.out.println(primInt);
   System.out.println(classInt);

  //Invalid
  //ArrayList<int> primIntList = new ArrayList<int>(); 

  //valid
  ArrayList<Integer> wrapClassIntList = new ArrayList<Integer>(); 

  System.out.println(classInt.intValue());

  String classIntToStr = classInt.toString();

  System.out.println(classIntToStr);
  System.out.println(classIntToStr.length());
  
  */

 /*
 //Try Catch

  // int[] myNum = {2,3,4,5};
  // System.out.println(myNum[10]);

  // try{
  //   int[] myNum = {2,3,4,5};
  //   System.out.println(myNum[10]);
  // }
  // catch(Exception e){
  //   System.out.println("Something went wrong");
  // }
  // finally{
  //   System.out.println("the try catch is done");
  // }

  

  checkAge(60);

  checkAge(10);
  */


/*
 //REGEX

//  Pattern pattern = Pattern.compile("nama saya", Pattern.CASE_INSENSITIVE);
//  Pattern pattern = Pattern.compile("[z]", Pattern.CASE_INSENSITIVE);
Pattern pattern = Pattern.compile("[nama]{1,6}", Pattern.CASE_INSENSITIVE);


//the first argument is pattern that will compare or search
// BRACKET use for find a range of characters
    // [abc] find one character from the options between the brackets
    // [^abc] find one character NOT between the brackets
    // [0-9] find one character from the range 0 to 9
// METACHARACTERS are character with a special meaning
    // | like or
    // . find just one
    // ^ beginning of a string
    // $ ending of a string
    // \d find digit
    // \s find a whitespace
    // \b beginning or ending of a word \bWORD or WORD\b
    // \_uxxxx find the unicode character specified by the hexadecimal number xxxx
// QUANTIFIERS define quantities
    // n+ matches any string that contains at least one n
    // n* matches any string that contains zero or more occurrences of n
    // n? matches any string that contains zero or one occurences of n
    // n{x} matches any string taht contains a seq of X n's
    // n{x,y} matches any string that contains a seq of X to Y n's
    // n{x,} matches any string that contains a seq of at least X n's



//the second argument is optional, is for flagging which type of search will perform
// several kind on it is : CASE_INSENSITIVE, LITERAL, UNICODE_CASE


 Matcher matcher = pattern.matcher("siapa nama saya? nama");
 boolean matchFound = matcher.find();

 if(matchFound){
  System.out.println("match found");
 }else{
  System.out.println("Match not found");
 }

*/

//Lambda expression

  ArrayList<Integer> myNumber = new ArrayList();
  myNumber.add(2);
  myNumber.add(4);
  myNumber.add(7);
  myNumber.add(9);

  myNumber.forEach((item) -> {
    System.out.println("myNumber is " + item);
  });

  Consumer<Integer> printNumOnlyMethod = (num) -> {System.out.println(num);};

  myNumber.forEach(printNumOnlyMethod);


  StringFunction exclaim = (s) -> s + '!';
  StringFunction ask = (s) -> s + '?';

  printFormatted("heii", exclaim);
  printFormatted("heii", ask);


  }
}