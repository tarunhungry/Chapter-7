// Return a String Object
class ErrorMsg{
    String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
    // return the error message
    String getErrorMsg(int i){
        if(i>=0 && i< msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";

    }

}
public class ErrMsg{
    public static void main(String[] args) {
        ErrorMsg error = new ErrorMsg();
        System.out.println(error.getErrorMsg(2));
        System.out.println(error.getErrorMsg(19));
    }
}