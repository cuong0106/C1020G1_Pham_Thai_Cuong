package Bai_5_Advanced_Object_Oriented_Design.Thuc_Hanh;

public class Chicken extends  Animal implements Edible  {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
