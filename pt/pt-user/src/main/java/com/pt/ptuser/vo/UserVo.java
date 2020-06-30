package com.pt.ptuser.vo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @author wl
 */
@Data
public class UserVo {
    private String userId;

    private String deptId;

    private String userName;

    private String nickName;

    private String password;

    private String email;

    private String phone;

    private char sex;

    private String avatar;

    private char status;

    private String deptName;


    /** 开始时间 */
    private String beginTime;

    /** 结束时间 */
    private String endTime;

}
