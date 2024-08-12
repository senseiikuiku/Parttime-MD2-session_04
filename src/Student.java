import java.util.Scanner;

public class Student {
    private String code;
    private String studentName;
    private int age;
    private boolean sex;
    private float markJS;
    private float markHTML;
    private float markJava;

    public Student() {

    }

    public Student(String code, String studentName, boolean sex, int age, float markJS, float markHTML, float markJava) {
        this.code = code;
        this.studentName = studentName;
        this.sex = sex;
        this.age = age;
        this.markJS = markJS;
        this.markHTML = markHTML;
        this.markJava = markJava;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMarkHTML() {
        return markHTML;
    }

    public void setMarkHTML(float markHTML) {
        this.markHTML = markHTML;
    }

    public float getMarkJS() {
        return markJS;
    }

    public void setMarkJS(float markJS) {
        this.markJS = markJS;
    }

    public float getMarkJava() {
        return markJava;
    }

    public void setMarkJava(float markJava) {
        this.markJava = markJava;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sv: ");
        this.code = sc.nextLine();
        System.out.print("Nhập tên sv: ");
        this.studentName = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = sc.nextInt();
        System.out.print("Nhập giới tính: ");
        this.sex = sc.nextBoolean();
        System.out.print("Nhập điểm HTML: ");
        this.markHTML = sc.nextFloat();
        System.out.print("Nhập điểm JS: ");
        this.markJS = sc.nextFloat();
        System.out.print("Nhập điểm Java: ");
        this.markJava = sc.nextFloat();
    }

    public void outputInfo() {
        System.out.println("\nThông tin sinh viên");
        System.out.println("Mã sinh viên: " + this.code);
        System.out.println("Tên sinh viên: " + this.studentName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + (this.sex ? "Nam" : "Nữ"));
    }

    public void graduate() {
        float Tb = (this.markHTML + this.markJS + this.markJava) / 3;
        if (Tb > 8) {
            System.out.printf("\nĐiểm trung bình= %.2f Giỏi",Tb);
        } else if (Tb > 7) {
            System.out.printf("\nĐiểm trung bình= %.2f Khá",Tb);
        } else if (Tb > 5) {
            System.out.printf("\nĐiểm trung bình= %.2f Trung bình",Tb);
        } else {
            System.out.printf("\nĐiểm trung bình= %.2f Yếu",Tb);
        }
    }
}
