package th.co.ptg.punthai.constant;

/**
 * Created by user on 19/4/2560.
 */
public enum AppEnum {

    NOTFOUND("404","NOT FOUND")
    ,OK("200","SUCCESS") ;



    private String code;
    private String des;

    AppEnum(String code, String des) {
        this.code = code;
        this.des = des;
    }

    public String code() {
        return code;
    }

    public String des() {
        return des;
    }

}
