class Info{
    int age;
    String name;
    int marks;
}
public class enhancedforloop {
    public static void main(String[] args) {
        Info s1=new Info();
        s1.name="koushik";
        s1.age=18;
        s1.marks=80;
        Info s2=new Info();
        s2.name="rithvik";
        s2.age=16;
        s2.marks=85;
        Info s3=new Info();
        s3.name="ram";
        s3.age=20;
        s3.marks=75;
      
        Info nums[]=new Info[3];
        nums[0]=s1;
        nums[1]=s2;
        nums[2]=s3;
        for(Info n: nums){
            System.out.println(n.name);
        }
    }
}
