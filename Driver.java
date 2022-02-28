public class Driver
{
    public static void main(String[] args)
    {
        Doctor doc = new Doctor("Joe Chung", "Doctor");
        System.out.println(doc.work());
        System.out.println(doc.quote());
        
        Nurse nurse = new Nurse("Mike Dean", "Nurse");
        System.out.println(nurse.work());
        System.out.println(nurse.quote());

        Administrator admin = new Administrator("Jeleel White", "Administrator");
        System.out.println(admin.work());
        System.out.println(admin.quote());

        Janitor jan = new Janitor("Michael Huang", "Janitor");
        System.out.println(jan.work());
        System.out.println(jan.quote());

        Receptionist rec = new Receptionist("Jenny Yan", "Receptionist");
        System.out.println(rec.work());
        System.out.println(rec.quote());

        Surgeon surg = new Surgeon("Nigo Cudi", "Surgeon");
        System.out.println(surg.work());
        System.out.println(surg.quote());

    }
}
abstract class HospitalEmployee {
    private String name, id;
    
    public HospitalEmployee(String employeename, String  employeeid)
    {
        name = employeename;
        id = employeeid;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getid()
    {
        return id;
    }

    @Override public String toString()
    {
       return "Employee" + name + "Employee ID" + id; 
    }
abstract public String work();
abstract public String quote();
}
class Doctor extends HospitalEmployee{
    private String name, id;     
    public Doctor(String name, String id){
        super(name,id);
        this.name = name;
        this.id = id;
    }
    public String work()
    {
        return "My name is " + name + "I am a " + id;
    }
    public String quote()
    {
        return "\"I'm not superstitious, but I am a little stitious\" -Steve Carrell";
    }  
}
class Nurse extends HospitalEmployee{
    private String name, id;     
    public Nurse(String name, String id){
        super(name,id);
        this.name = name;
        this.id = id;
    }
    public String work()
    {
        return "My name is " + name + "I am a " + id;
    }
    public String quote()
    {
        return "\"Why do they call it rush hour when nothing moves?\" -Robin Williams";
    }  
}
class Administrator extends HospitalEmployee{
    private String name, id;     
    public Administrator(String name, String id){
        super(name,id);
        this.name = name;
        this.id = id;
    }
    public String work()
    {
        return "My name is " + name + "I am a " + id;
    }
    public String quote()
    {
        return "\"Before you marry a person make them use a computer with slow internet to see who they really are\" -Will Ferell";
    }  
}
class Janitor extends Administrator{
    private String name, id;
    public Janitor(String name, String id){
        super(name,id);
        this.name = name;
        this.id = id;
    }
    public String work()
    {
        return "My name is " + name + "I am a " + id;
    }
    public String quote()
    {
        return "\"People say nothing is impossible but I do nothing every day.\"";
    }
}
class Receptionist extends Administrator{
    private String name, id;
    public Receptionist(String name, String id){
        super(name,id);
        this.name = name;
        this.id = id;
    }
    public String work()
    {
        return "My name is " + name + "I am a " + id;
    }
    public String quote()
    {
        return "\"Someone asked me, if I were stranded on a deset island what book would I bring...How to build a boat\" -Steven Wright";
    }
}
class Surgeon extends Doctor{
    private String name, id;
    public Surgeon(String name, String id){
        super(name,id);
        this.name = name;
        this.id = id;
    }
    public String work()
    {
        return "My name is " + name + "I am a " + id;
    }
    public String quote()
    {
        return "\"Good resolutions are simply checks that men draw on a bank where they have no account.\" -Oscar Wilde";
    }
}
