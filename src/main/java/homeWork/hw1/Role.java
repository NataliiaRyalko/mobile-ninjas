package homeWork.hw1;

public class Role {

    private boolean isSuperUser;
    private String value;

    public boolean setIsSuperUser;
    public String role;

    public Role(){
        this.setIsSuperUser = true;
        this.value = "QA";
    }
    public void setIsSuperUser(boolean isSuperUser){

        this.isSuperUser = isSuperUser;
    }
    public boolean getIsSuperUser(){

        return(isSuperUser);
    }
    public void setValue(String value){

        this.value = value;
    }
    public String getValue(){

        return(value);
    }

}
