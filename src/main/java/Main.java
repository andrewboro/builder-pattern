public class Main {
    public static void main(String[] args) {
        Witcher witcher = Witcher.Builder.witcher().withName("Geralt").withOriginLocation("Rivia").withSign("Aard").build();
        System.out.println(witcher);
    }
}
