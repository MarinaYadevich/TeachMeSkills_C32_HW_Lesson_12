package by.teachmeskills.yadevich.lesson12.task1;

public class HexValidatorColor {
    private static final String hexCode = "^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$";

    public static boolean hexValidatorColor(String st){
        if(st.isEmpty()){
            throw new IllegalArgumentException("Line is empty.");
        }else if(st.matches(hexCode)) {
            System.out.println("Yes.");
            return true;
        }else{
            System.out.println("No.");
            return false;
        }
    }
}
