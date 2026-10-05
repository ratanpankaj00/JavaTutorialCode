public class PracticeSet8Q2 {
       public static class Cellphone{
        public static String Ringing(){
            return "Ringing";
        }
        
        public static String Vibrating(){
            return "Vibrating";
        }
       }
    public static void main(String[] args){
        Cellphone call = new Cellphone();
        System.out.println(Cellphone.Ringing());
        System.out.println(call.Vibrating());

    }
}
