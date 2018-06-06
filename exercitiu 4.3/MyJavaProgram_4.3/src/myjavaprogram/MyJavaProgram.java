package myjavaprogram;

public class MyJavaProgram {

    public static void main(String[] args) {
        
        Patrat p = new Patrat("patrat", "negru", 5);
        System.out.println("Arie patrat " + p.arie());
        
        
        Dreptunghi d = new Dreptunghi("dreptunghi","rosu",5,8);
        System.out.println("Arie dreptunghi " + d.arie());
        
        
        Cerc c = new Cerc ("cerc","verde",3);
        System.out.println("Arie cerc " + c.arie());
        
    }
}
