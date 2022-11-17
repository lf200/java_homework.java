package kaoshi;

class Student{
    private String id, name;
    private int height, weight;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        if(height>0 & height <= 300){
            this.height = height;
        }
        else {
            System.out.println("height set error");
        }
    }
    public Student(String id, String name, int height, int weight){
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;

    }
    public Student(Student student){
        this.id = student.id;
        this.name = student.name;
        this.weight = student.weight;
        this.height = student.height;
    }

    @Override
    public String toString() {
        return "id=" + id+",name="+name+",height="+height+",weight="+weight;
    }

    public void setWeight(int weight) {
        if(weight>0 & weight <= 500){
            this.weight = weight;
        }
        else {
            System.out.println("weight set error");
        }
    }

}
public class Text_2_2 {

}
