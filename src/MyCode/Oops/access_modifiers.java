package MyCode.Oops;
/*
Access Modifier - which things accessible to whuch one
4 types
1. Public = can accessible to anyone/ in different packages too
2. Private = can accessible in 1 class
3. Protected = can accessible in 1 package -- in other package, used by sub-classes
4. Default = automatic accessible within 1 package
 */

class Account {
    public String name;
    protected String email;
    private String password;
    // getters and setters -- use to get private modifier indirectly
    // getters = take and return private info

    public String getPassword(){
        // setPassword(randomPass); == to get some random value
        return this.password;
    }

// setters = set some value for private info

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Rahul";
        a1.email = "rahul@gmail.com";
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());
    }
}
