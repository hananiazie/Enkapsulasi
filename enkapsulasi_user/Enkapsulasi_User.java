
package enkapsulasi_user;

public class Enkapsulasi_User {

    
    public static void main(String[] args) {
        User azie = new User("WHAT", "APA", 0, false);
        
        azie.setUsername("azie");
        azie.setPassword("kopiJava");
        azie.setId(0);
        azie.setStatus(false);
        
        System.out.println("Username: " + azie.getUsername());
        System.out.println("Password: " + azie.getPassword());
        System.out.println("Id: " + azie.getId());
        System.out.println("Status: " + azie.isStatus());
    }
    
}
