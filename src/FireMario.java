public class FireMario implements MARIO{
    @Override
    public String name() {
        return "FEU";
    }

    @Override
    public void run() {
        System.out.println("Mario feu court beaucoup plus vite");
    }

    @Override
    public void jump() {
        System.out.println("Mario feu saute beaucoup plus haut");
    }
}
