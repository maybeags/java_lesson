package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20240001, "안근수");

        sam.showInfo();
        sam.setName("안근순");
        sam.showInfo();

        System.out.println(sam.getCode());
    }
}
