public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("D", "Xám", "Cat", 20, true);

        cat1.catName = "L";
        cat1.color = "Đen";
        cat1.type = "Cat";
        cat1.weight = 10;
        cat1.sex = true;

        cat1.eat();
        cat2.eat();


    }
}
