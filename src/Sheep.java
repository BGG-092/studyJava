//복제 기능은 clone 보단 복제팩터리 or 복제생성자를 이용하는게 좋다
//단 배열만은 예외다 배열은 clone 를 사용하는게 깔끔하다.
public class Sheep {

    private String name;

    private int weight;

    public Sheep(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    //복제 기능 중 복제팩터리를 이용한방법
    public static Sheep newInstance(Sheep other) {
        return new Sheep(other.name, other.weight);
    }
    //복제 기능 중 복제생성자를 이용한방법
    public Sheep(Sheep other) {
        this.name = other.name;
        this.weight = other.weight;
    }

    public static void main(String[] args) {
        Sheep sh = new Sheep("몰라",130);
        System.out.println(sh.name+" " +sh.weight);
        Sheep sh2 = newInstance(sh);
        System.out.println(sh2.name+" "+ sh2.weight);
    }

}

