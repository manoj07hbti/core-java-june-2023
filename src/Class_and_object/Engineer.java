package Class_and_object;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Engineer {
    //Data member
    String name;
    int duration;
    String Branch;
    String college;

    //parameterize constructor

    public Engineer(String name, int duration, String branch, String college) {
        this.name = name;
        this.duration = duration;
        Branch = branch;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public static void main(String[] args) {
        Engineer Engineer1= new Engineer("Ron", 4, "EXTC", "RMC");
        System.out.println("Engineer1 Name is:"+ Engineer1.name + " Duration is:"+Engineer1.duration + " Branch is:"+Engineer1.Branch+" College is:"+Engineer1.college);
        Engineer Engineer2= new Engineer("Roshan", 4, "CSE", "SIPNA");
        System.out.println("Engineer2 Name is:"+ Engineer2.name + " Duration is:"+Engineer2.duration + " Branch is:"+Engineer2.Branch+" College is:"+Engineer2.college);

        System.out.println("Value after using setter method");

        Engineer1.setName("Ashwin");
        Engineer1.setBranch("EEE");
        Engineer1.setDuration(5);
        Engineer1.setCollege("SSS");
        System.out.println("Engineer1 Name is:"+ Engineer1.name + " Duration is:"+Engineer1.duration + " Branch is:"+Engineer1.Branch+" College is:"+Engineer1.college);

        Engineer2.setName("Pooja");
        Engineer2.setBranch("CIVIL");
        Engineer2.setDuration(4);
        Engineer2.setCollege("PRPT");
        System.out.println("Engineer2 Name is:"+ Engineer2.name + " Duration is:"+Engineer2.duration + " Branch is:"+Engineer2.Branch+" College is:"+Engineer2.college);
    }
}
