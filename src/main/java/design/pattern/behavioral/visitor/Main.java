package design.pattern.behavioral.visitor;

interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Tiger tiger);
    void visit(Elephant elephant);
}

interface Animal {
    void accept(AnimalVisitor visitor);
}

class Lion implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

class Tiger implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

class Elephant implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

//关键代码 方法重载
class AnimalSoundsVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Roar");
    }

    @Override
    public void visit(Tiger tiger) {
        System.out.println("Growl");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Trumpet");
    }
}

class AnimalWeightVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Lion weighs around 190 kg");
    }

    @Override
    public void visit(Tiger tiger) {
        System.out.println("Tiger weighs around 190 kg");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Elephant weighs around 6000 kg");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal elephant = new Elephant();

        AnimalSoundsVisitor soundsVisitor = new AnimalSoundsVisitor();
        AnimalWeightVisitor weightVisitor = new AnimalWeightVisitor();

        lion.accept(soundsVisitor);
        lion.accept(weightVisitor);
        System.out.println();

        tiger.accept(soundsVisitor);
        tiger.accept(weightVisitor);
        System.out.println();

        elephant.accept(soundsVisitor);
        elephant.accept(weightVisitor);
    }
}
