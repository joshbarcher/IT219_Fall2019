package slides;

public class TestDogs
{
    public static void main(String[] args)
    {
        //instantiate the Dog class
        Dog sparky = new Dog("Sparky", "Pug", true, 4.5);
        Dog beauregard = new Dog("Beauregard", "Golden Retriever", true, 30.5);
        Dog fluffy = new Dog();

        //we use dot-notation to access or change field data
        System.out.println(sparky.getName() +  " is a " + sparky.getBreed());

        sparky.setBreed("puggle"); //pug/beagle
        System.out.println(sparky.getName() +  " is a " + sparky.getBreed());

        sparky.makeNoise();
        beauregard.makeNoise("ruff ruff");

        System.out.println(sparky.isPopularBreed());
        System.out.println(fluffy.isPopularBreed());

        sparky.setWeight(-10);
        System.out.println("Sparky weight: " + sparky.getWeight());

        System.out.println(sparky.toString());
        System.out.println(beauregard.toString());
        System.out.println(fluffy.toString());
    }
}
