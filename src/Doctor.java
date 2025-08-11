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
 @Override
    public String  toString(){
            return "doctorName="+doctor_name+",doctorSalary="+doctor_salary+",age="+doctor_age;
 }
}
