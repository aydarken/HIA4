package kz.lab2.models;


public class Users {

    private String username;


    public Users() {

    }

    public Users( String username) {

        this.username = username;

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @Override
    public String toString() {
        return "Users{" +

                ", username='" + username + '\'' +
                '}';
    }
}


