package ch06;

public class Mouse extends Animal {
    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
    }

    @Override
    public void eat(){
        System.out.println(getName()+"吃奶酪");
    }

}
