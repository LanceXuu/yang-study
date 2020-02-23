package com.wangwang.yangstudycommon.RNUM;

import java.util.List;

/**
 * @program: yang-study
 * @description:
 * @author: Mr.Wang
 * @create: 2019-10-10 14:23
 **/
public enum ClearTypeEnum
{
    ADD_EGG ("100001","add_egg","增加积分"),
    EXPIRE_EGG ("100002","expire_egg","过期积分"),
    CREATE_ORDER ("100003","create_order","创建订单"),
    CREATE_DEPOSIT_ORDER ("100004","create_deposit_order","创建订单"),
    REFUND_ORDER_CONSUME_PREMIUM_PRICE ("100005","refund_order_consume_premium_price","退款课消溢价"),
    REFUND_ORDER_INVOICE_TAX_PREMIUM_PRICE ("100006","refund_order_invoice_tax_premium_price","退款发票溢价"),
    REFUND_ORDER_CX_ALL ("100007","refund_order_cx_all","退款冲销"),
    REFUND_ORDER_CX_LEFT ("100008","refund_order_cx_left","退款冲销剩余"),
    REFUND_ORDER_CX_GIFT ("100009","refund_order_cx_gift","退款冲销大礼包"),
    REFUND_ORDER_CX_GIFT_IPAD ("100010","refund_order_cx_gift_ipad","退款冲销大礼包"),
    REFUND_ORDER_CX_CONFIRM_INCOME ("100011","refund_order_cx_confirm_income","退款冲销已确认收入"),
    REFUND_ORDER_B_IPAD_APPORTION ("100012","refund_order_b_ipad_apportion","退款后补ipad分录"),
    CREATE_ORDER_CHANGE_CONFIRM_INCOME ("100013","create_order_change_confirm_income","重新分摊后调整差值"),
    REFUND_ORDER_CHANGE_CONFIRM_INCOME ("100014","refund_order_change_confirm_income","重新分摊后调整差值（退款）"),
    REFUND_ORDER_DISCOUNT_MARKETING ("100015","refund_order_discount_marketing","退费后贴息转营销费用"),
    REFUND_ORDER_CX_EGGSHELL_CONFIRM_INCOME ("100016","refund_order_cx_eggshell_confirm_income","订单退款回冲积分收入"),
    REFUND_ORDER_CX_EGGSHELL_CONFIRM_COST_TO_FEE ("100017","refund_order_cx_eggshell_confirm_cost_to_fee","订单退款成本转费用"),
    REFUND_ORDER_CX_EGG_EXCHANGE_PHYSICAL_INCOME ("100018","refund_order_cx_egg_exchange_physical_income","订单退款回冲积分兑换实物收入"),
    REFUND_ORDER_CX_EGG_EXCHANGE_PHYSICAL_INCOME_DISCOUNT_FEE ("100019","refund_order_cx_egg_exchange_physical_income_discount_fee","订单退款回冲积分兑换实物收入"),
    REFUND_ORDER_CX_EGG_EXCHANGE_COURSE_INCOME ("100020","refund_order_cx_egg_exchange_course_income","订单退款回冲积分兑换课程包收入"),
    REFUND_ORDER_CX_EGG_EXCHANGE_COURSE_INCOME_DISCOUNT_FEE ("100021","refund_order_cx_egg_exchange_course_income_discount_fee","订单退款回冲积分兑换课程包贴息收入"),
    REFUND_ORDER_CX_EGG_EXCHANGE_VIRTUAL_INCOME ("100022","refund_order_cx_egg_exchange_virtual_income","订单退款回冲积分兑换虚拟物品收入"),
    REFUND_ORDER_CX_EGG_EXCHANGE_VIRTUAL_INCOME_DISCOUNT_FEE ("100023","refund_order_cx_egg_exchange_virtual_income_discount_fee","订单退款回冲积分兑换虚拟物品贴息收入"),
    REFUND_ORDER_CX_EGG_EXCHANGE_COURSE_CONSUME_INCOME ("100024","refund_order_cx_egg_exchange_course_consume_income","订单退款回冲积分兑换课程课消收入"),
    REFUND_ORDER_CX_EGG_EXCHANGE_COURSE_CONSUME_INCOME_DISCOUNT_FEE ("100025","refund_order_cx_egg_exchange_course_consume_income_discount_fee","订单退款回冲积分兑换课程课消贴息"),
    REFUND_ORDER_CX_EGG_EXCHANGE_PHYSICAL_COST_TO_FEE ("100026","refund_order_cx_egg_exchange_physical_cost_to_fee","订单退款积分兑换实物成本转费用"),
    REFUND_ORDER_CX_EGG_EXCHANGE_COURSE_COST_TO_FEE ("100027","refund_order_cx_egg_exchange_course_cost_to_fee","订单退款积分兑换实物成本转费用"),
    REFUND_ORDER_CX_EGG_EXCHANGE_VIRTUAL_COST_TO_FEE ("100028","refund_order_cx_egg_exchange_virtual_cost_to_fee","订单退款积分兑换虚拟物品成本转费用"),
    REFUND_ORDER_CX_EGG_EXCHANGE_COURSE_CONSUME_COST_TO_FEE ("100029","refund_order_cx_egg_exchange_course_consume_cost_to_fee","订单退款积分兑换课程课消成本转费用"),
    REFUND_ORDER_COMPENSATION ("100030","refund_order_compensation","退费补差"),
    GIFT_SEND_OFF ("100031","gift_send_off","大礼包发货"),
    GIFT_CB ("100032","gift_cb","大礼包成本"),
    CONSUME_CLASS ("100033","consume_class","课消"),
    FINISH_TYPE ("100034","finish_type","消耗的finishType"),
    REFUND_DEPOSIT_ORDER ("100035","refund_deposit_order",""),
    EGG_EXCHANGE_PHYSICAL ("100036","egg_exchange_physical","积分兑换实物"),
    EGG_EXCHANGE_PHYSICAL_DISCOUNT_FEE ("100037","egg_exchange_physical","积分兑换实物贴息"),
    EGG_EXCHANGE_COURSE ("100038","egg_exchange_course","积分兑换实物贴息"),
    EGG_EXCHANGE_COURSE_DISCOUNT_FEE ("100039","egg_exchange_course_d","积分兑换实物贴息"),
    EGG_EXCHANGE_VIRTUAL ("100040","egg_exchange_virtual","积分兑换虚拟物品"),
    EGG_EXCHANGE_VIRTUAL_DISCOUNT_FEE ("100041","egg_exchange_virtual_discount_fee","积分兑换虚拟物品贴息"),
    EGG_EXCHANGE_COURSE_CONSUME ("100042","egg_exchange_course_consume","积分兑换课程课消"),
    EGG_EXCHANGE_COURSE_CONSUME_DISCOUNT_FEE ("100043","egg_exchange_course_consume_discount_fee","积分兑换课程课消贴息"),
    EGG_EXCHANGE_PHYSICAL_INCOME ("100044","egg_exchange_physical_income","积分兑换实物收入"),
    EGG_EXCHANGE_PHYSICAL_INCOME_DISCOUNT_FEE ("100045","egg_exchange_physical_income_discount_fee","积分兑换实物贴息收入"),
    EGG_EXCHANGE_COURSE_INCOME ("100046","egg_exchange_course_income","积分兑换课程包收入"),
    EGG_EXCHANGE_COURSE_INCOME_DISCOUNT_FEE ("100047","egg_exchange_course_income_discount_fee","积分兑换课程包贴息收入"),
    EGG_EXCHANGE_VIRTUAL_INCOME ("100048","egg_exchange_virtual_income","积分兑换虚拟物品收入"),
    EGG_EXCHANGE_VIRTUAL_INCOME_DISCOUNT_FEE ("100049","egg_exchange_virtual_income_discount_fee","积分兑换虚拟物品贴息收入"),
    EGG_EXCHANGE_COURSE_CONSUME_INCOME ("100050","egg_exchange_course_consume_income","积分兑换课程课消收入"),
    EGG_EXCHANGE_COURSE_CONSUME_INCOME_DISCOUNT_FEE ("100051","egg_exchange_course_consume_income_discount_fee","积分兑换课程课消贴息收入"),
    EGG_EXCHANGE_PHYSICAL_COST ("100052","egg_exchange_physical_cost","积分兑换实物成本"),
    EGG_EXCHANGE_COURSE_COST ("100053","egg_exchange_course_cost","积分兑换实物成本"),
    EGG_EXCHANGE_VIRTUAL_COST ("100054","egg_exchange_virtual_cost","积分兑换虚拟物品成本"),
    EGG_EXCHANGE_COURSE_CONSUME_COST ("100055","egg_exchange_course_consume_cost","积分兑换课程课消成本"),
    EGG_EXCHANGE_PHYSICAL_FEE ("100056","egg_exchange_physical_fee","积分兑换实物费用"),
    EGG_EXCHANGE_COURSE_FEE ("100057","egg_exchange_course_fee","积分兑换课程包费用"),
    EGG_EXCHANGE_VIRTUAL_FEE ("100058","egg_exchange_virtual_fee","积分兑换课程包费用"),
    EGG_EXCHANGE_COURSE_CONSUME_FEE ("100059","egg_exchange_course_consume_fee","积分兑换课程课消费用"),
    REFUND_ORDER_CX_ALL_TRANSFER_CZ ("100060","refund_order_cx_all_transfer_cz","退款冲销所有中转金额调差"),
    REFUND_ORDER_CX_LEFT_TRANSFER_CZ ("100061","refund_order_cx_left_transfer_cz","退款冲销剩余中转金额调差"),
    REFUND_ORDER_CX_LEFT_TRANSFER ("100062","refund_order_cx_left_transfer","退款冲销剩余中转"),
    REFUND_ORDER_CX_ALL_TRANSFER ("100063","refund_order_cx_all_transfer;","退款冲销全部中转"),
    CREATE_ORDER_DISCOUNT_FEE ("100064","create_order_discount_fee",""),
    GIFT_SEND_OFF_DISCOUNT_FEE ("100065","gift_send_off_discount_fee",""),
    CONSUME_CLASS_DISCOUNT_FEE ("100066","consume_class_discount_fee",""),
    REFUND_ORDER_CX_ALL_DISCOUNT_FEE ("100067","refund_order_cx_all_discount_fee",""),
    REFUND_ORDER_CX_GIFT_DISCOUNT_FEE ("100068","refund_order_cx_gift_discount_fee",""),
    REFUND_ORDER_CX_ALL_TRANSFER_DISCOUNT_FEE ("100069","refund_order_cx_all_transfer_discount_fee",""),
    REFUND_ORDER_DISCOUNT_MARKETING_DISCOUNT_FEE ("100070","refund_order_discount_marketing_discount_fee",""),
    REFUND_ORDER_CX_LEFT_TRANSFER_DISCOUNT_FEE ("100071","refund_order_cx_left_transfer_discount_fee",""),
    REFUND_ORDER_CX_CONFIRM_INCOME_DISCOUNT_FEE ("100072","refund_order_cx_confirm_income_discount_fee","");


    public String sapOrder;
    public String order;//非贴息clear_type
    public String remark;


    ClearTypeEnum(String sapOrder,String order, String remark)
    {
        this.sapOrder = sapOrder;
        this.order  =order;
        this.remark  =remark;
    }
}
