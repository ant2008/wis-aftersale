package com.wenc.commonservice.constant;

/**
 * 业务代码需要使用的常量
 */
public class BaseServiceConstant {

    //序列号类

    public static final String Serial_Code_GlCustomer="1009";

    public static final String Serial_Code_GlConsult = "2402";

    public static final String Serial_Code_AfterSale = "3100";

    public static final String Serail_Code_AfterSaleCustomer="3101";






    //校验码类
    public static final String Vcode_Type_Common = "0";


    //咨询订单业务状态
    public static final String Consult_DoState_WaitPay="0";
    public static final String Consult_DoState_WaitConsult="1";
    public static final String Consult_DoState_Consult="2";
    public static final String Consult_DoState_Finished="3";
    public static final String Consult_DoState_Canceled="4";
    public static final String Consult_DoState_Closed="9";


    //支付台账单据类型。
    public static final String Gl_Payment_Type_Order="0";
    public static final String Gl_Payment_Type_Reserver="1";
    public static final String Gl_Payment_Type_Consult="2";

    //咨询类型
    public static final String Gl_Consult_Type_Txt="0";
    public static final String Gl_Consult_Type_Viedo="1";
    public static final String Gl_Consult_Type_Phone="2";

    //售后订单状态。
    public static final String Af_Order_DoState_WaitPay="0";
    public static final String Af_Order_DoState_WaitAlloc="1";
    public static final String Af_Order_DoState_HaveAlloc="2";
    public static final String Af_Order_DoState_WaitConfirm="3";
    public static final String Af_Order_DoState_Finished="4";
    public static final String Af_Order_DoState_Canceled="5";


    public static final String Upload_Img_Type_Defa="defa";




}
