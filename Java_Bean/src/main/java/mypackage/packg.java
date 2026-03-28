package mypackage;

import java.io.Serializable;

public class packg implements Serializable {

    private int rno;
    private String sname;

    public packg() {}

    public void setRno(int r) {
        rno = r;
    }

    public int getRno() {
        return rno;
    }

    public void setSname(String sn) {
        sname = sn;
    }

    public String getSname() {
        return sname;
    }
}