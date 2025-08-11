import java.util.concurrent.RecursiveTask;

public class Doctor {
    private String doctor_name;
    private double doctor_salary;
    private int doctor_age;

    public Doctor(String doctor_name,double doctor_salary,int doctor_age){
        this.doctor_name=doctor_name;
        this.doctor_salary=doctor_salary;
        this.doctor_age=doctor_age;

    }
    public Doctor(){
    }
    //getters
    public String getDoctor_name(){
        return doctor_name;
    }
    public double getDoctor_salary(){
        return doctor_salary;
    }
    public int getDoctor_age(){
        return doctor_age;
    }
    //setters
    public void setDoctor_name(String doctorname){
        this.doctor_name=doctorname;
    }
    public void setDoctor_salary(double doctor_salary){
        this.doctor_salary=doctor_salary;
    }
    public void setDoctor_age(int doctor_age){
        this.doctor_age=doctor_age;
    }
 @Override
    public String  toString(){
            return "doctorName="+doctor_name+",doctorSalary="+doctor_salary+",age="+doctor_age;
 }
}
