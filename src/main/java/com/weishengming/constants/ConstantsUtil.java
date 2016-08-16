package com.weishengming.constants;

public class ConstantsUtil {

    public static final String  COLL_GETNIHUA                    = "geinihua";                                                                                                         //给你花

    public static final String  Promo_money                      = "10";                                                                                                               //推荐码优惠面值
    public static final String  Promo_line                       = "1000";                                                                                                             //推荐码满可用金额
    public static final String  Promo_huodong                    = "-999";                                                                                                             //推荐优惠券活动标示-1
    public static final String  prepare_coupon_huodong           = "-2";                                                                                                               //预约优惠券活动标示
    public static final String  HREmail                          = "hr@99fenqi.com";                                                                                                   //HR接收简历邮箱hr@99fenqi.com
    public static final String  HREmail_cc                       = "yuanjun@99fenqi.com";                                                                                              //HR接收简历邮箱yuanjun@99fenqi.com
    public static final String  HUODONG                          = "7";                                                                                                                //优惠券活动
    //4-国庆活动（2015.10.01-2015.10.15） 5-未使用 双11	6-12月h5优惠券

    public static final double  GeinihuaMonthMoneybo             = 100.0;                                                                                                              //给你花下单单笔订单每月最小月供（学生）
    public static final double  GeinihuaMonthMoneyTop            = 500.0;                                                                                                              //给你花下单单笔订单每月最大月供（学生）
    public static final double  GeinihuaMonthMoneyTopAd          = 2500.0;                                                                                                             //给你花每月最大月供(成人)
    public static final double  MaxMonthPay                      = 700.0;                                                                                                              //学生月还款累计月供
    public static final double  MaxMonthPay_ad                   = 2500.0;                                                                                                             //成人月还款累计月供
    public static final double  GeinihuaMaxMoneyAd               = 10000.0;                                                                                                            //给你花申请金额上限（成人）
    public static final double  GeinihuaMaxMoneySc               = 3000.0;                                                                                                             //给你花申请金额上限
    public static final String  geinihua_fuwufei_sc              = "0.02";                                                                                                             //学生服务费
    public static final String  geinihua_fuwufei_ad              = "0.05";                                                                                                             //成人服务费

    public static final String  TJIN_PROMPT                      = "到账金额=借款金额-前期服务费，前期服务费在您借款到账时收取，合同里的本金为借款金额";                                                                       //下单验证返回信息
    public static final String  PAYPROMPT                        = "您需在还款日前，进入'我>我的还款'进行还款；";

    public static final String  COLL_JPUSH_BINDUSER              = "jPush_bindUser";
    public static final String  COLL_JPUSH_MESSAGE               = "jPush_messsage";

    public static final String  extraProvince                    = "新疆,西藏,江西,福建,湖南";                                                                                                   //不能办理的地区

    public static final Integer timePoint1                       = 14;                                                                                                                 //热卖商品第一个时间点
    public static final Integer timePoint2                       = 20;                                                                                                                 //热卖商品第二个时间点
    public static final Integer hotProductTime                   = 2;                                                                                                                  //热卖商品活动持续时间（小时）

    //订单详情相关
    public static final String  orderliu                         = "订单已受理；预计1-7个工作日完成审核，请您耐心等待；订单审核通过（如有首付，支付成功后即可发货）；首付已支付，配送中（3-5天），物流单号：；签收人姓名：";
    public static final String  orderliu_top                     = "订单提交受理成功；订单审核中；订单审核成功；配送中；已签收；";
    public static final String  geinihualiu                      = "订单已受理；预计1-7个工作日完成审核，请您耐心等待；订单审核通过；给你花金额到账成功";
    public static final String  geinihualiu_top                  = "订单提交受理成功；订单审核中；订单审核通过；已到账";

    //用户资料相关
    public static final String  userinfo_adult                   = "baseInfo,yunYingShang,yinHangka,ralatives,images,zhima,workInfo,taobaoAccount,jdAccount,creditCard,callList";
    public static final String  userinfo_student_vno_geinihuaapp = "baseInfo,yinHangka,ralatives,images,zhima,schoolInfo,xueXinWang2,taobaoAccount,jdAccount,call,callList";
    public static final String  userinfo_student_vno_normal      = "baseInfo,yinHangka,ralatives,images,zhima,schoolInfo,xueXinWang2,xueXinWang,taobaoAccount,jdAccount,call,callList";
    public static final String  userinfo_student_normal          = "baseInfo,yunYingShang,yinHangka,ralatives,images,zhima,schoolInfo,xueXinWang2,xueXinWang,callList";

    public static final String  image_path                       = "http://image.fenqifu.com.cn:13080/image.jsp?filename=";

}
