abstract class MarioMaker {
    abstract MARIO createMario();
    void operation(){
        MARIO mario = createMario();
        System.out.println(mario.name());
        mario.jump();
        mario.run();
    }
}
