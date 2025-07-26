public class Student {
    private  String name;
    private int age;
    private String className;
    private double avgScore;

    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassStudent() {
        return className;
    }

    public double getAvgScore() {
        return avgScore;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Tuổi: " + age + ", Lớp: " + className + ", Điểm trung bình: " + avgScore;
    }
}
