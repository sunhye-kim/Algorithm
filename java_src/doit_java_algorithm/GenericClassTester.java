package doit_java_algorithm;

public class GenericClassTester {
    // 제네릭 클래스의 파라미터를 T라고 작성
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t){
            this.xyz = t;
        }
        T getXyz(){
            return xyz;
        }
    }

    static void main(String[] args) {
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> i = new GenericClass<Integer>(1);

        System.out.println(s.getXyz());
        System.out.println(i.getXyz());
    }
}
