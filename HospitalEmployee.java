public abstract class HospitalEmployee {
    private String name, id;
    
    public HospitalEmployee(String employeename, String  employeeid)
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

    public String toString()
    {
       return "Employee" + name + "Employee ID" + id; 
    }
abstract public String work();
}
