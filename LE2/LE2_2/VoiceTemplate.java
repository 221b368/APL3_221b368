public abstract class VoiceTemplate {
    protected Animal[] animals;

    public final void templateMethod() {
        prepareVoice();
        hear();
    }

    protected abstract void prepareVoice();

    protected void hear() {
        for (Animal animal : animals) {
            makeVoice(animal);
        }
    }

    private void makeVoice(Animal animal) {
        System.out.println("Voice of " + animal.getClass().getSimpleName().toLowerCase() + ": " + animal.makeVoice());
    }
}
