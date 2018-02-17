package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class SignUpResponse implements Serializable{
    @SerializedName("keyValuePairs")
    @Expose
    private List<KeyValuePairs> keyValuePairs;
    @SerializedName("userId")
    @Expose
    private long userId;
    @SerializedName("status")
    @Expose
    private int status;

    public SignUpResponse() {
    }

    public SignUpResponse(List<KeyValuePairs> keyValuePairs, long userId, int status) {
        this.keyValuePairs = keyValuePairs;
        this.userId = userId;
        this.status = status;
    }

    public List<KeyValuePairs> getKeyValuePairs() {
        return keyValuePairs;
    }

    public void setKeyValuePairs(List<KeyValuePairs> keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SignUpResponse{" +
                "keyValuePairs=" + keyValuePairs +
                ", userId=" + userId +
                ", status=" + status +
                '}';
    }
}
