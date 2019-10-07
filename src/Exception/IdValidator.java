package Exception;

public class IdValidator {
    static void kiemtratinhhoplecuaid(String id) throws Exception{
        if (!(id.matches("^[0-9]{9}$"))){
            throw new Exception("id ma ban nhap vao khong hop le");
        }
    }
}
