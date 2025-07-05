class Info{
    String name;
    int age;
    int marks;
}

public class obj_array{
    public static void main(String[] args) {
        Info s1=new Info();
        s1.name="koushik";
        s1.age=18;
        s1.marks=80;
        Info s2=new Info();
        s2.name="rithvik";
        s2.age=16;
        s2.marks=90;
        Info s3=new Info();
        s3.name="Ram";
        s3.age=20;
        s3.marks=56;
        Info student[]=new Info[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;
        for(int i=0;i<student.length;i++){
            System.out.println(student[i].name+":"+student[i].marks+":"+student[i].age);
        }
        
    }
}