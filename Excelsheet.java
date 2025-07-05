public class Excelsheet {
    public static void main(String[] args) {
        String a="AA";
        demo(a);
    }
    static void demo(String a){
        StringBuilder sb=new StringBuilder();
        int result=0;
        int ans=0;
          for(int i=0;i<a.length();i++){
            result=result*26;
            result=result+a.charAt(i)-'A'+1;
          }
          System.out.println(result);
    }
}
