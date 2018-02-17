package aahackathon.com.aahackathon.dao;

import com.google.gson.annotations.SerializedName;

public class LoginPojo {
    @SerializedName("keyValuePairs")
    private String[] keyValuePairs;
    private LoginPojoUserContractBean userContractBean;
    private int status;

    public String[] getKeyValuePairs() {
        return this.keyValuePairs;
    }

    public void setKeyValuePairs(String[] keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
    }

    public LoginPojoUserContractBean getUserContractBean() {
        return this.userContractBean;
    }

    public void setUserContractBean(LoginPojoUserContractBean userContractBean) {
        this.userContractBean = userContractBean;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
