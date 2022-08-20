package chapter06;

public class Student {

    String name;

    int ban;

    int no;

    int kor;

    int eng;

    int math;

    Student(){}

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return Math.round(getTotal() / 3f * 100) / 100f;
    }

    public String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + getTotal() + "," + getAverage();
    }
}
