import org.w3c.dom.NameList;

public abstract class HospitalEmployee {
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

    public String getJob()
    {
        return name+" is a the "+id;
    }
    public String toString()
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
        return "I am a "+id;
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
        return "I am a "+id;
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
        return "I am a "+id;
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
        return "I am a "+id;
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
        return "I am a "+id;
    }
    public String quote()
    {
        return "\"Someone ask me, if I were stranded on a deset island what book would I bring...How to build a boat\" -Steven Wright";
    }
}