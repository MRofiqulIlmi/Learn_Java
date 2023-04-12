class OuterClass{
    int x = 5;
    
    class InnerClass{
        int y = 3;

        int nilaiOuter (){
            return x;
        }
    }


}

class Outer2Class{
    int x2 = 2;

    static class Inner2Class{
        int y2 = 4;
    }
}

