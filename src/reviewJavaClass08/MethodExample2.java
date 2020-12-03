package reviewJavaClass08;

public class MethodExample2 {
    public static void main(String[] args) {
        printNTime("Please study", 5);
        MethodExample2 methodExample2 = new MethodExample2();
    }

    static void printNTime(String word, int nTimes){
        for(int i=0; i<nTimes; i++){
            System.out.println(word);
        }
    }

    void printRainInfo(){
        isItRaining(false);
        printNTime("Study", 5);
    }
    public void isItRaining(boolean isRaining){
        if(isRaining){
            System.out.println("Please take the umbrella");
        }else{
            System.out.println("Let's go for a work");
        }
    }
}
