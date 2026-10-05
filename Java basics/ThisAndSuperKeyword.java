class EkClass{
    int a;
    EkClass(int v){
        a = v;
    }
    public int getA(){
        return a;
    }

    public int returnOne(){
        return 1;
    }

}

public class ThisAndSuperKeyword {
    public static void main(String[] args){
        EkClass e =new EkClass(65);
        System.out.println(e.getA());
    }
}
