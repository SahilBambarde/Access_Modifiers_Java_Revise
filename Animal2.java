class Animal2 {
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.display();
        //I am an animal
    }
}
