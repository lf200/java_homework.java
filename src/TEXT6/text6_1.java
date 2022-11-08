package TEXT6;

public class text6_1 {
    public static void main(String[] args) {

    }
}
class People{
    protected double height;
    protected double weight;
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void speakHello(){
        System.out.println("hello!");
    }
    public void averageHeight(){
        System.out.println("average heigh:" + height);
    }
    public void averageWeight(){
        System.out.println("average weight:" + weight);
    }
}
class AmericanPeople extends People{
    public void speakHello(){
        System.out.println("hello,I am American");
    }
    public void averageHeight(){
        System.out.println("average heigh of American:" + height);
    }
    public void averageWeight(){
        System.out.println("average weight of American:" + weight);
    }
    public void americanBoxing(){
        System.out.println("I am boxing.");
    }
}
class ChinaPeople extends People{
    public void speakHello(){
        System.out.println("hello,I am ChinaPeople.");
    }
    public void averageHeight(){
        System.out.println("average heigh of ChinaPeople:" + height);
    }
    public void averageWeight(){
        System.out.println("average weight of ChinaPeople:" + weight);
    }
    public void chinaGongfu(){
        System.out.println("I can gongfu.");
    }
}
