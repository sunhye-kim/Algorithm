package doit_java_algorithm;

class Id {
    private static int counter = 0; // 아이디를 몇개 부여했는지
    private int id; // 아이디

    //생성자
    public Id(){
        id = ++counter;
    }

    //아이디 반환 인스턴스 메서드
    public int getId(){
        return id;
    }
    //카운터 반환 클래스 메서드
    public static int getCounter(){
        return counter;
    }
}
public class IdTester {
    static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println(a.getId());
        System.out.println(b.getId());

        System.out.println(Id.getCounter());
    }
}
