package th.co.ptg.punthai.bean;

/**
 * Created by user on 19/4/2560.
 */
public class ResponseData<T,E,S> {

    private E code;
    private S message;
    private T  data;

    public ResponseData() {
    }

    public ResponseData(E code, S message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public E getCode() {
        return code;
    }

    public void setCode(E code) {
        this.code = code;
    }

    public S getMessage() {
        return message;
    }

    public void setMessage(S message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
