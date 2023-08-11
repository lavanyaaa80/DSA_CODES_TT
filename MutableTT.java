public class MutableTT {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //flexibility
        //StringBuffer sb = new StringBuffer("Amit"); // Old Version (Legacy) Synchrozied (Block)
        System.out.println(sb.capacity()); // 16 
        System.out.println(sb.length());  //4
        synchronized(sb){
            sb.append("aaaa");
            sb.append("bbbb");
        }// NewCapacity=oldCapacity*2+2
        System.out.println(sb.capacity()); // 16 + 4 
        System.out.println(sb.length());
        sb.append("Srivastava , Delhi - 7 Phone: 88888888, Area Code 110007, Street Address");
        System.out.println(sb.capacity()); 
        System.out.println(sb.length());
        sb.append("A-11");
        System.out.println(sb.capacity()); 
        System.out.println(sb.length());
        System.out.println(sb);


    }
}
