package com.lhm.reflect4train;

/**
 * 用户业务类
 */
public class UserServices {
    /**
     *
     * @param name 用户名
     * @param passWord 密码
     * @return true表成功，false表示失败
     */
    public boolean login(String name,String passWord){
        if ("admin".equals(name)&&"123".equals(passWord)){
            return true;
        }
        return false;
    }

    public void logOut(){
        System.out.println("退出成功");
    }
}
