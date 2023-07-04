//Tread
// there is two ways :
    //extend Thread and overriding run()
    //or
    //implements Runnable

/*
public class ThreadLearn extends Thread{
    public static void main(String[] args){
        ThreadLearn thread = new ThreadLearn();
        //the start will run the thread
        thread.start();
        System.out.println("this code outside the thread");
    }
    
    public void run(){
        System.out.println("this is for running thread");
    }
}
*/

/*
public class ThreadLearn implements Runnable{
    public static void main(String[] args){
        ThreadLearn obj = new ThreadLearn();
        Thread thread = new Thread(obj);
        //the start will run the thread
        thread.start();
        System.out.println("this code is outside of thread");
    }
    public void run(){
        System.out.println("this is for run in a thread");
    }
 
}

*/


//this is the concurrency problem when using Thread

/*
public class ThreadLearn extends Thread{
    public static int count = 0;

    public static void main(String[] args){
        ThreadLearn thread = new ThreadLearn();
        thread.start();
        //this will be 0
        System.out.println(count);
        count++;
        //this will be 2
        System.out.println(count);

    } 

    public void run(){
        count++;
    }
}

*/

public class ThreadLearn extends Thread{
    public static int count = 0;

    public static void main(String[] args){
        ThreadLearn thread = new ThreadLearn();
        thread.start();

        while(thread.isAlive()){
            System.out.println("still waiting the thread");
        }


        
        System.out.println(count);
        count++;
        
        System.out.println(count);

    } 

    public void run(){
        count++;
    }
}