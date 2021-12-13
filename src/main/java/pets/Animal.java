package pets;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {return weight;}

    public void setWeight(int weight) {this.weight = weight;}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void say() {
        System.out.println("Я говорю");
    }

    void go() {
        System.out.println("Я иду");
    }

    void eat() {
        System.out.println("Я ем");
    }

    void drink() {
        System.out.println("Я пью");
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age + " " + years() + ", я вешу - " + weight + " кг, мой цвет - " + color;
    }

    private Object years() {
        String result = "год";
        if (age == 1) {
            result = "год";
        } else if (age == 0 || age >= 5 && age <= 9  || age == 11) {
            result = "лет";
        } else if (age >= 2 && age <= 4) {
            result = "года";
        }
        return result;
    }
}