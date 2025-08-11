public class Main {
    public static void  main(String[] args){
     //  System.out.println("hello teta");
        Doctor TETA=new Doctor("teta",50000,78);
        System.out.println(TETA);
        System.out.println(TETA.getDoctor_name()+TETA.getDoctor_age());

        TETA.setDoctor_name("YOUNKY");
        System.out.println(TETA);
     TETA.setDoctor_salary(4000000);
        System.out.println(TETA);

        System.out.println("name="+TETA.getDoctor_name()+ ","+"salary="+TETA.getDoctor_salary());
    }

}
