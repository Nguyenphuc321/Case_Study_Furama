package Exception;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class EmailValidator {

    static void kiemtratinhhoplecuaemailvoidexception(String email) throws Exception {
        if (!(email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))) {
            throw new Exception("email ban nhap vao khong hop le");
        }
    }
}
