package class_activity_10A.Ex;

public class ReverseStringEx {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));

    }


    public static String reverseString(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
        }
    }
