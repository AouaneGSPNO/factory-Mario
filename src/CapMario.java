public class CapMario implements MARIO{
    @Override
    public String name() {
        return "CAPE";
    }

    @Override
    public void run() {
        System.out.println("Mario cape fait des manoeuvres en courant ");
    }

    @Override
    public void jump() {
        System.out.println("Mario cape fait des sauts successifs");
    }
}
