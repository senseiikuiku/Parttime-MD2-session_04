public class Cat {
    public String catName;
    public  String color;
    public String type;
    public float weight;
    public boolean sex;

    public Cat() {

    }

    public Cat(String catName,String color, String type, float weight, boolean sex){
        this.catName = catName;
        this.color = color;
        this.type = type;
        this.weight = weight;
        this.sex=sex;
    }

    public void eat(){
        System.out.println(this.weight+" is eating");
    }
}
