package lab3;

public class P15 {
    static String rev="";
    static String reverse(String s){
            if(s.length()==1) return s;
            else {
                    rev+=s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
                    return rev;
            }
    }
    public static void main(String[] args) {
        String str="madam";
        String rev=reverse(str);
        if(str.equals(rev))
                System.out.println("Pallindrome");
        else System.out.println("Not pallindrome");
        //System.out.println(reverse("HELLO"));
}

}
