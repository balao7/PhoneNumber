package org.xdty.phone.number.local.google;

import android.text.TextUtils;

import org.xdty.phone.number.model.INumber;
import org.xdty.phone.number.model.Type;

public class GooglePhoneNumber implements INumber {

    private String mNumber;
    private String mOperator;
    private String mProvince;

    public GooglePhoneNumber() {

    }

    protected GooglePhoneNumber(String number, String operator, String province) {
        mNumber = number;
        mOperator = operator;
        mProvince = province;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getProvince() {
        return mProvince;
    }

    @Override
    public Type getType() {
        return Type.NORMAL;
    }

    @Override
    public String getCity() {
        return "";
    }

    @Override
    public String getNumber() {
        return mNumber;
    }

    @Override
    public String getProvider() {
        return mOperator;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isValid() {
        return !TextUtils.isEmpty(mNumber);
    }

    @Override
    public boolean isOnline() {
        return false;
    }

    @Override
    public boolean hasGeo() {
        return getProvince() != null;
    }

    @Override
    public int getApiId() {
        return INumber.API_ID_GOOGLE;
    }

    @Override
    public void patch(INumber i) {

    }
}