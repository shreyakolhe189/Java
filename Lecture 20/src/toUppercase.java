public class toUppercase {
    //convert  first letter of each word to uppercase
    // word after empty space
    //Character.toUppercase(ch);
    public static String toUpperCase(String str){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<=str.length()-1; i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "hi i am shreya";

        System.out.println(toUpperCase(str));


    }
}