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

    }
}