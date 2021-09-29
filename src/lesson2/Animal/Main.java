package lesson2.Animal;

public class Main {
    public static void main(String[] msi) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Тузик", "Мясной суп", "Двор");
        animals[1] = new Cat("Барсик", "Каша", "Прихожая");
        animals[2] = new Horse("Иннокентий", "Сено", "Конюшня");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
