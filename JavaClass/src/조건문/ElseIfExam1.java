package 조건문;
public interface ElseIfExam1 {
    public static void main(String[] args) {
        int age = 22;

        if (age>= 20 && age <30) {
            System.out.println("20대");
        } else if (age < 20) {
            System.out.println("10대 이하");
        }
    }
}
