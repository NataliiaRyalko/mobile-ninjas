package homeWork.hw1;

public class Runner {
    public static void main(String[] args) {

        User us = new User();
        Role roleMain = new Role ();
        us.setRole(roleMain);

        System.out.println(us.getName());
        System.out.println(us.getAge());
        System.out.println(roleMain.getIsSuperUser());
        System.out.println(roleMain.getValue());

        us.setAge((short)20);
        us.setName("Nataliia");
        System.out.println(us.getName());
        System.out.println(us.getAge());
        System.out.println(roleMain.getValue());
        System.out.println(roleMain.getIsSuperUser());

    }

}
