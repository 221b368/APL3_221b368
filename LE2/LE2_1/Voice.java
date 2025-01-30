
class Voice {
    private Animal[] animals;

    public void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    public void hear() {
        for (Animal animal : animals) {
            makeVoice(animal);
        }
    }

    private void makeVoice(Animal animal) {
        System.out.println("Voice of " + animal.getClass().getSimpleName().toLowerCase() + ": " + animal.makeVoice());
    }
}
