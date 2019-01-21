package homeWork.hw1;

public class User {

    private short age;
    private String name;
    private Role role;


    public User() {
        this.age = 10;
        this.name = "Nata";
        this.role = new Role();
    }

    public void setAge(short age){

        this.age = age;
    }
    public short getAge() {
        return (age);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return (name);
    }

    public void setRole(Role role){
        this.role = role;
    }
    public Role getRole() {
        return (role);
    }
}
