package by.teachmeskills.yadevich.lesson12.task2;

public class CheckLink {
    private static final String valid =
            "^https?:\\/\\/(?:www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b(?:[-a-zA-Z0-9()@:%_\\+.~#?&\\/=]*)$";

    public static boolean isValidLink(String str){
        if(str.isEmpty() && str == null){
            throw new IllegalArgumentException("Line is empty or null");
        }else if(str.matches(valid)){
            System.out.println("Link is valid.");
            return true;
        }else{
            System.out.println("Link is not valid.");
            return false;
        }
    }
}
