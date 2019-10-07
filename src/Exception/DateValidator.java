package Exception;

public class DateValidator {
    static void namhople(int nam) throws Exception{
        if (nam>1990){
            throw new Exception("nam ma ban nhap vao khong hop le");
        }
    }
}
