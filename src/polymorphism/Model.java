
package polymorphism;

public class Model {
    
    String name, city, age;

    public Model(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Model(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAge() {
        return age;
    }
    
    
}
