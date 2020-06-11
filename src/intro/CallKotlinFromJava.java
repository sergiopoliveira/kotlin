package intro;

public class CallKotlinFromJava {

    public static void main(String[] args) {
        System.out.println(Utils.topLevel());
        System.out.println(Utils.sum(1));
        System.out.println(Utils.lastChar("abc"));
        System.out.println(Utils.repeat("test", 3));
    }
}
